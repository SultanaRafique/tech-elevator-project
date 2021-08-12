package com.techelevator.dao;

import com.techelevator.model.Park;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

public class JdbcParkDaoTests extends UnitedStatesDaoTests {

    private static final Park PARK_1 =
            new Park(1, "Park 1", LocalDate.parse("1800-01-02"), 100, true);
    private static final Park PARK_2 =
            new Park(2, "Park 2", LocalDate.parse("1900-12-31"), 200, false);
    private static final Park PARK_3 =
            new Park(3, "Park 3", LocalDate.parse("2000-06-15"), 300, false);

    private JdbcParkDao sut;

    private Park testData;

    @Before
    public void setup() {
        sut = new JdbcParkDao(dataSource);

        // to use for inserting data
        testData = new Park(0, "Test Park", LocalDate.now(), 500, false);
    }

    @Test
    public void getPark_returns_correct_park_for_id() {
        // ask for park with id 2
        Park result = sut.getPark(2);

        // should match PARK_2
        assertParksMatch(PARK_2, result);

        // ask for park with id 1
        result = sut.getPark(1);

        // should match PARK_1
        assertParksMatch(PARK_1, result);
    }

    @Test
    public void getPark_returns_null_when_id_not_found() {
        // ask for park by if that does not exists
        Park result = sut.getPark(999);

        // make sure null was returned
        Assert.assertNull(result);
    }

    @Test
    public void getParksByState_returns_all_parks_for_state() {

        // get park list for "AA'
        List<Park> result = sut.getParksByState("AA");

        // should have 2 elements based on data
        Assert.assertEquals(2, result.size());

        // confirm that elements in list match those expected=
        assertParksMatch(PARK_1, result.get(0));
        assertParksMatch(PARK_3, result.get(1));
    }

    @Test
    public void getParksByState_returns_empty_list_for_abbreviation_not_in_db() {
        // ask for list of parkls for state that doesn't exist
        List<Park> result = sut.getParksByState("XX");;

        // should still get back a List (but empty)
        Assert.assertNotNull(result);

        // Since empty, size should be 0
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void createPark_returns_park_with_id_and_expected_values() {
        // create park from testData
        Park result = sut.createPark(testData);

        // update testData so its id matches that of the
        testData.setParkId(result.getParkId());

        // saved park should not have 0 for id - should have been updated with real id
        Assert.assertTrue(result.getParkId() > 0);

        // rest of data matches as well
        assertParksMatch(testData, result);


    }

    @Test
    public void created_park_has_expected_values_when_retrieved() {
        // create a park
        Park newPark = sut.createPark(testData);

        // retrieve it using the returned if
        Park result = sut.getPark(newPark.getParkId());

        // make sure value returned from create matches what was retrieved
        assertParksMatch(newPark, result);

    }

    @Test
    public void updated_park_has_expected_values_when_retrieved() {
        // retrieve a park  object
        Park initial = sut.getPark(2);

        // modify if
        initial.setParkName("Test Park");

        // update in db
        sut.updatePark(initial);

        // retreive park again
        Park result = sut.getPark(2);

        // make sure data was updated
        Assert.assertEquals("Test Park", result.getParkName());
    }

    @Test
    public void deleted_park_cant_be_retrieved() {
        // delete a park by id
        sut.deletePark(3);

        // attempt to retrieve that id again
        Park result = sut.getPark(3);

        // should no exist, so should return null
        Assert.assertNull(result);
    }

    @Test
    public void park_added_to_state_is_in_list_of_parks_by_state() {
        // add another park to CC
        sut.addParkToState(1, "CC");

        // get park list for cc
        List<Park> result = sut.getParksByState("CC");

        // should now have items
        Assert.assertEquals(2, result.size());

        // should be correct items
        assertParksMatch(PARK_1, result.get(0));
        assertParksMatch(PARK_3, result.get(1));



    }

    @Test
    public void park_removed_from_state_is_not_in_list_of_parks_by_state() {
        // delete a park from a state
        sut.removeParkFromState(1, "AA");

        // get the list of parks
        List<Park> result = sut.getParksByState("AA");

        // previously had 2, should now have 1
        Assert.assertEquals(1, result.size());

    }

    private void assertParksMatch(Park expected, Park actual) {
        Assert.assertEquals(expected.getParkId(), actual.getParkId());
        Assert.assertEquals(expected.getParkName(), actual.getParkName());
        Assert.assertEquals(expected.getDateEstablished(), actual.getDateEstablished());
        Assert.assertEquals(expected.getArea(), actual.getArea(), 0.1);
        Assert.assertEquals(expected.getHasCamping(), actual.getHasCamping());
    }

}
