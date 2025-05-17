import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import zhuanzhangxinxi from '@/views/modules/zhuanzhangxinxi/list'
    import yinxing from '@/views/modules/yinxing/list'
    import kefufankui from '@/views/modules/kefufankui/list'
    import kahaozhanghu from '@/views/modules/kahaozhanghu/list'
    import cunkuanxinxi from '@/views/modules/cunkuanxinxi/list'
    import yonghu from '@/views/modules/yonghu/list'
    import qukuanxinxi from '@/views/modules/qukuanxinxi/list'
    import tongzhixinxi from '@/views/modules/tongzhixinxi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/zhuanzhangxinxi',
        name: '转账信息',
        component: zhuanzhangxinxi
      }
      ,{
	path: '/yinxing',
        name: '银行',
        component: yinxing
      }
      ,{
	path: '/kefufankui',
        name: '客服反馈',
        component: kefufankui
      }
      ,{
	path: '/kahaozhanghu',
        name: '卡号账户',
        component: kahaozhanghu
      }
      ,{
	path: '/cunkuanxinxi',
        name: '存款信息',
        component: cunkuanxinxi
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/qukuanxinxi',
        name: '取款信息',
        component: qukuanxinxi
      }
      ,{
	path: '/tongzhixinxi',
        name: '通知信息',
        component: tongzhixinxi
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '系统首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '/aichat',
    name: 'AI客服',
    component: () => import('@/views/modules/aichat/list'),
    meta: { 
      icon: 'el-icon-chat-line-round', 
      title: 'aichat',
    }
  },
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
