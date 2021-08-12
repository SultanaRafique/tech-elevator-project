-- select the park name, campground name, open_from_mm, open_to_mm & daily_fee ordered by park name and then campground name
SELECT name AS campground_name,(SELECT name FROM park p WHERE p.park_id = cg.park_id )AS park_name, open_from_mm, open_to_mm, daily_fee FROM campground cg;


-- select the park name and the total number of campgrounds for each park ordered by park name
SELECT p.name , COUNT(cg.campground_id) FROM park p
JOIN campground cg ON cg.park_id = p.park_id
GROUP BY (p.name) ORDER BY p.name;


-- select the park name, campground name, site number, max occupancy, accessible, max rv length, utilities where the campground name is 'Blackwoods'
SELECT p.name AS park_name, cg.name AS campground_name, s.site_id, s.max_occupancy, accessible, max_rv_length, utilities FROM site s
JOIN campground cg ON cg.campground_id = s.campground_id
JOIN park p ON p.park_id = cg.park_id
WHERE cg.name = 'Blackwoods';


/*
  select park name, campground, total number of sites (column alias 'number_of_sites') ordered by park
  -------------------------------------------------
    Acadia	Blackwoods	276
    Acadia	Seawall	198
    Acadia	Schoodic Woods	92
    Arches	"Devil's Garden"	49
    Arches	Canyon Wren Group Site	1
    Arches	Juniper Group Site	1
    Cuyahoga Valley	The Unnamed Primitive Campsites	5
  -------------------------------------------------
*/

SELECT p.name AS park_name, cg.name AS campground_name , COUNT(s.site_id) AS number_of_sites FROM Site s
JOIN campground cg ON cg.campground_id = s.campground_id
JOIN park p ON p.park_id = cg.park_id
GROUP BY (campground_name, p.name) ORDER BY park_name;


-- select site number, reservation name, reservation from and to date ordered by reservation from date
SELECT site_id, name, from_date, to_date FROM reservation ORDER BY from_date;



/*
  select campground name, total number of reservations for each campground ordered by total reservations desc
  -------------------------------------------------
    Seawall	13
    Blackwoods	9
    "Devil's Garden"	7
    Schoodic Woods	7
    The Unnamed Primitive Campsites	5
    Canyon Wren Group Site	4
    Juniper Group Site	4
  -------------------------------------------------
*/

SELECT cg.name AS campground_name,  COUNT(r.reservation_id) AS number_of_reservations FROM reservation r
JOIN site s ON s.site_id = r.site_id
JOIN campground cg ON cg.campground_id = s.campground_id
GROUP BY (campground_name) ORDER BY number_of_reservations DESC;



