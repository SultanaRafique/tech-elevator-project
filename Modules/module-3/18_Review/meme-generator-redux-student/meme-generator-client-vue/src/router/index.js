import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '@/views/Home'
import CreateMeme from '@/views/CreateMeme'

Vue.use(VueRouter)

const routes = [
  /* create a route that will map / to the Home view */
  {
    path: '/',
    name: 'home',
    component: Home
  },

  /* create a path to the CreateMeme view which includes the memeId*/
  {
    path: '/create-meme/ :id',
    name: 'create-meme',
    component: CreateMeme
  },
 
  /* create a path to the MemeResult view */
  {
    path: '/create-result/ :id',
    name: 'create-result',
    component: MemeResult
  }
 

]

const router = new VueRouter({
  routes
})

export default router
