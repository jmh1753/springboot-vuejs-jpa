import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import Carculator from '@/components/basic/Calculator'
import MemberList from '@/components/member/MemberList'
import JoinForm from '@/components/member/joinForm'
import LoginForm from '@/components/member/LoginForm'
import Test1 from '@/components/test/test1'



Vue.use(Router)

export default new Router({
  mode : 'history', 
  routes: [
    {path: '/', name: 'home', component: Home},
    {path : '/calculator', name: 'calculator', component: Carculator},
    {path : '/memberlist', name: 'memberlist', component: MemberList},
    {path : '/joinform', name: 'joinform', component: JoinForm}, 
    {path : '/loginform', name: 'loginform', component: LoginForm},
    {path : '/test1', name: 'test1', component: Test1},
  ]
})
