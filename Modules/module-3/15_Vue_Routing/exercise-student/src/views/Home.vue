<template>
<div>
<div>
    
    <best-seller-list />
</div>

<div>
    
    <new-releases-list />
    
</div>



 </div> 
</template>

<script>

import BestSellerList from '../components/BestSellerList.vue';
import NewReleasesList from '../components/NewReleasesList.vue';

export default {
    name: 'home',
    components: {
        BestSellerList,
        NewReleasesList,
        
       
    }

}
</script>

<style>

</style>