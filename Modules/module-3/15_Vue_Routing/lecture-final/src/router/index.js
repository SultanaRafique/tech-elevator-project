import Vue from 'vue'
import VueRouter from 'vue-router'
import Products from '@/views/Products'
import Product from '@/views/Product'
import AddReviewForm from '../views/AddReviewForm'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'products',
    component: Products
  },
  {
    path: '/products/:id',
    name: 'product',
    component: Product
  },
  {
    path: '/products/:id/add-review',
    name: 'add-review',
    component: AddReviewForm
  }

]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
