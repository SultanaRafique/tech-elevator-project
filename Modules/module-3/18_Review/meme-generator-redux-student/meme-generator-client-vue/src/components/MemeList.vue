<template>
    <div>
        <table>
            <thead>
                <th>Starting Image Name</th>
            </thead>
            <tbody>
                <!-- create table rows for each meme name -->
                <tr v-for="meme in $store.state.memes" v-bind:key="meme.id">
                    <td>
                        <!-- show the meme name and link it to
                         the CreateMeme view with the meme id 
                         -->
                         <router-link  v-bind:to ="{ name: 'create-meme', params:{id: meme.memeId}}">
                         {{meme.memeName}}
                          </router-link>
                    </td>
                </tr>
            </tbody>
        </table>
    </div>
  
</template>

<script>

/* Load the meme list and save it in the data store */


/* use the meme list in the data store in the table in the template */
import memeService from '../services/MemeService'
export default {
    name: 'meme-list',
    created() {

        memeService.getMemes().then(Response => {
            this.$store.commit('SET_MEMES', Response.data);
        }).catch(error => {
            if (error.Response){
                console.log(`Client error: ${error.status}`)
            }
        })

    }

}
</script>

<style>
    table {
        margin-left: auto;
        margin-right: auto;
        border: 2px solid black;
    }

    th, td {
        border: 2px solid black;
    }
</style>