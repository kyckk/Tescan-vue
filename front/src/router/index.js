import { createRouter, createWebHistory } from 'vue-router'
import PageHome from '@/views/PageHome.vue'
import CustomerList from '@/views/customer/CustomerList.vue'
import EquipMent from '@/views/equipMent/EquipMent.vue'

const routes = [
  {
    path: '/',
    name: 'PageHome',
    component: PageHome
  },
  {
    path: '/customer/list',
    name: 'CustomerList',
    component: CustomerList
  },
  {
    path: '/equipMent/equip',
    name: 'EquipMent',
    component: EquipMent
  },
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router