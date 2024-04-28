import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Messages from '../pages/messages/list'
import Forum from '../pages/forum/list'
import ForumAdd from '../pages/forum/add'
import ForumDetail from '../pages/forum/detail'
import MyForumList from '../pages/forum/myForumList'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import wenzhangfenleiList from '../pages/wenzhangfenlei/list'
import wenzhangfenleiDetail from '../pages/wenzhangfenlei/detail'
import wenzhangfenleiAdd from '../pages/wenzhangfenlei/add'
import wenzhangbiaoqianList from '../pages/wenzhangbiaoqian/list'
import wenzhangbiaoqianDetail from '../pages/wenzhangbiaoqian/detail'
import wenzhangbiaoqianAdd from '../pages/wenzhangbiaoqian/add'
import wenzhangxinxiList from '../pages/wenzhangxinxi/list'
import wenzhangxinxiDetail from '../pages/wenzhangxinxi/detail'
import wenzhangxinxiAdd from '../pages/wenzhangxinxi/add'
import aboutusList from '../pages/aboutus/list'
import aboutusDetail from '../pages/aboutus/detail'
import aboutusAdd from '../pages/aboutus/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'messages',
					component: Messages
				},
				{
					path: 'forum',
					component: Forum
				},
				{
					path: 'forumAdd',
					component: ForumAdd
				},
				{
					path: 'forumDetail',
					component: ForumDetail
				},
				{
					path: 'myForumList',
					component: MyForumList
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'wenzhangfenlei',
					component: wenzhangfenleiList
				},
				{
					path: 'wenzhangfenleiDetail',
					component: wenzhangfenleiDetail
				},
				{
					path: 'wenzhangfenleiAdd',
					component: wenzhangfenleiAdd
				},
				{
					path: 'wenzhangbiaoqian',
					component: wenzhangbiaoqianList
				},
				{
					path: 'wenzhangbiaoqianDetail',
					component: wenzhangbiaoqianDetail
				},
				{
					path: 'wenzhangbiaoqianAdd',
					component: wenzhangbiaoqianAdd
				},
				{
					path: 'wenzhangxinxi',
					component: wenzhangxinxiList
				},
				{
					path: 'wenzhangxinxiDetail',
					component: wenzhangxinxiDetail
				},
				{
					path: 'wenzhangxinxiAdd',
					component: wenzhangxinxiAdd
				},
				{
					path: 'aboutus',
					component: aboutusList
				},
				{
					path: 'aboutusDetail',
					component: aboutusDetail
				},
				{
					path: 'aboutusAdd',
					component: aboutusAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
