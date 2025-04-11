<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="true" %>

<!-- 首页 -->
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>首页</title>
    <link rel="stylesheet" href="../../layui/css/layui.css">
    <link rel="stylesheet" href="../../xznstatic/css/bootstrap.min.css" />
    <!-- 样式 -->
    <link rel="stylesheet" href="../../css/style.css"/>
    <!-- 主题（主要颜色设置） -->
    <link rel="stylesheet" href="../../css/theme.css"/>
    <!-- 通用的css -->
    <link rel="stylesheet" href="../../css/common.css"/>
</head>
<style>
    /*padding-bottom 属性设置元素的下内边距（底部空白）*/
    .pb-120 {
        padding-bottom: 50px;
    }
    /*padding-top 属性设置元素的上内边距（头部空白）*/
    .pt-120 {
        padding-top: 20px;
    }

    .cmn-accordion .card-header .acc-btn .plus-icon::after {
        position: absolute;
        content: '';
        top: 50%;
        left: 50%;
        height: 25px;
        width: 1px;
        background-color: #bec452;
        -webkit-transform: translate(-50%, -50%) rotate(90deg);
        -ms-transform: translate(-50%, -50%) rotate(90deg);
        transform: translate(-50%, -50%) rotate(90deg);
        -webkit-transition: all 0.3s;
        -o-transition: all 0.3s;
        transition: all 0.3s;
    }

    .cmn-accordion .card-body {
        padding: 0;
    }

    blockquote {
        padding: 0 50px;
    }

    @media (max-width: 767px) {
        blockquote {
            padding: 0 30px;
        }
    }

    blockquote p {
        font-size: 24px;
        font-style: italic;
        text-align: center;
        font-family: "Playfair Display", serif;
    }

    @media (max-width: 767px) {
        blockquote p {
            font-size: 20px;
        }
    }


    /* 评论样式 和文本框样式 */
    body {
        font-family: "Raleway", sans-serif;
        font-size: 16px;
        padding: 0;
        margin: 0;
        font-weight: 400;
        position: relative;
        overflow-x: hidden;
    }

    img {
        max-width: 100%;
        height: auto;
    }

    ul, ol {
        padding: 0;
        margin: 0;
        list-style: none;
    }

    button {
        border: none;
    }

    input, textarea {
        padding: 10px 20px;
        border: 1px solid #e5e5e5;
        width: 100%;
        background-color: #ffffff;
    }


    textarea {
        min-height: 150px;
        resize: none;
    }

    /* 标题下面的蓝色字体 删除就会换行 */

    .post-meta {
        display: -ms-flexbox;
        display: flex;
        -ms-flex-wrap: wrap;
        flex-wrap: wrap;
        margin: 0 -8px;
        margin-top: 5px;
    }

    .post-meta li {
        margin: 3px 8px;
    }

    .post-meta li a {
        font-size: 12px;
    }


    .blog-single-classic .content {
        margin-top: 25px;
    }



    /* 博客详情部分 css start */
    .blog-details-wrapper .blog-details-header {
        margin-top: 25px;
        padding-bottom: 15px;
        border-bottom: 1px solid #e5e5e5;
    }



    .comments-area {
        margin-top: 50px;
    }

    .comments-area .title {
        text-transform: capitalize;
        margin-bottom: 30px;
    }

    .comments-list .single-comment {
        display: flex;
        flex-wrap: wrap;
        padding: 30px 0;
        border-bottom: 1px solid #e5e5e5;
    }

    .comments-list .single-comment:first-child {
        padding-top: 0;
    }

    .comments-list .single-comment:last-child {
        padding-bottom: 0;
        border-bottom: none;
    }

    .comments-list .single-comment .thumb {
        flex: 0 0 80px;
        -ms-flex: 0 0 80px;
        max-width: 80px;
        height: 80px;
        border-radius: 50%;
        -webkit-border-radius: 50%;
        -moz-border-radius: 50%;
        -ms-border-radius: 50%;
        -o-border-radius: 50%;
        overflow: hidden;
    }

    .comments-list .single-comment .content {
        flex: 0 0 calc(100% - 80px);
        -ms-flex: 0 0 calc(100% - 80px);
        max-width: calc(100% - 80px);
        padding-left: 20px;
    }



    .comments-list .single-comment .content .date {
        font-size: 14px;
    }

    .comments-list .single-comment .content p {
        margin-top: 5px;
    }

    .comments-list .single-comment .content .comment-action {
        margin-top: 3px;
    }

    .comment-form-area {
        margin-top: 50px;
    }

    .comment-form-area .title {
        margin-bottom: 30px;
    }

    .comment-form-area .comment-form .form-group {
        margin-bottom: 30px;
    }

    .sidebar .widget + .widget {
        margin-top: 50px;
    }


    .sidebar .widget-title {
        font-size: 24px;
        text-transform: capitalize;
        margin-bottom: 30px;
        position: relative;
        padding-left: 15px;
    }

    .sidebar .widget-title::before {
        position: absolute;
        content: '';
        top: 4px;
        left: 0;
        width: 5px;
        height: 23px;
        background-color: var(--publicMainColor,orange);
    }

    .sidebar .category-list li {
        padding: 10px 0;
        border-bottom: 1px solid #e5e5e5;
    }

    /*位置为 Latest Blog Post 意思 最新博客 样式*/
    .small-post-list .small-post-single:first-child {
        padding-top: 0;
    }
    .small-post-list .small-post-single {
        display: -ms-flexbox;
        display: flex;
        -ms-flex-wrap: wrap;
        flex-wrap: wrap;
        padding: 20px 0;
        border-bottom: 1px solid #e5e5e5;
    }

    .small-post-list .small-post-single .content {
        width: calc(100% - 65px);
        padding-left: 15px;
    }



    /* 侧边栏 css end */

    .cmn-btn-border {
        padding: 13px 35px;
        font-size: 18px;
        text-transform: capitalize;
        color: #ffffff;
        background-color: var(--publicMainColor,orange);
        position: relative;
        z-index: 1;
        -webkit-transition: all 0.3s;
        -o-transition: all 0.3s;
        transition: all 0.3s;
        border-radius: 3px;
        -webkit-border-radius: 3px;
        -moz-border-radius: 3px;
        -ms-border-radius: 3px;
        -o-border-radius: 3px;
    }

    .cmn-btn-border:hover {
        color: #ffffff;
        box-shadow: 0 5px 10px 0 rgba(0, 0, 0, 0.15);
    }

    .cmn-btn-border:hover::before {
        top: 0;
        left: 0;
    }

    .cmn-btn-border::before {
        position: absolute;
        content: '';
        top: -5px;
        left: -5px;
        width: 100%;
        height: 100%;
        background-color: var(--publicMainColor,orange);
        z-index: -10;
        border: 2px solid #ffffff;
        -webkit-transition: all 0.3s;
        -o-transition: all 0.3s;
        transition: all 0.3s;
    }

    .cmn-btn-border::after {
        position: absolute;
        content: '';
        top: 0;
        left: 0;
        width: 100%;
        height: 100%;
        background-color: var(--publicMainColor,orange);
        z-index: -10;
        border: 2px solid #ffffff;
    }

    .blog-details-wrapper .blog-details-footer {
        padding: 20px 20px;
        border: 1px solid #f2f2f2;
        margin-top: 40px;
        display: -ms-flexbox;
        display: flex;
        -ms-flex-wrap: wrap;
        flex-wrap: wrap;
        justify-content: space-between;
    }</style>
<body>

    <div id="app">
        <section class="blog-details-section pt-120 pb-120">
            <div class="data-detail-breadcrumb" style="width: 1110px; padding: 0px 10px; box-shadow: rgba(255, 0, 0, 0.3) 0px 0px 0px; margin: 20px auto; border-color: rgb(135, 206, 250); border-radius: 4px; border-width: 0px; border-style: solid; height: 54px;">
                <span class="layui-breadcrumb">
                    <a href="../home/home.jsp">首页</a>
                    <a><cite>{{detail.wenhuachanpinName}}</cite></a>
                </span>

                <!-- 收藏 -->
                <a v-if='storeupFlag' onclick="addWenhuachanpinCollection()" href="javascript:void(0)">
                    <i class="layui-icon" style="font-size: 20px;color: red;">&#xe67a;</i>取消收藏
                </a>
                <a v-if='!storeupFlag' onclick="addWenhuachanpinCollection()" href="javascript:void(0)">
                    <i class="layui-icon" style="font-size: 20px;color: red;">&#xe67b;</i>点我收藏
                </a>
            </div>
    <div class="container">
        <div class="row">
            <div class="col-lg-8">
                <div class="blog-details-wrapper">
                    <div><img :src="detail.wenhuachanpinPhoto" alt="image" style="width: 80%;height: auto" ></div>
                    <div class="blog-details-header">
                        <h3 class="blog-details-title">{{title}}</h3>
                        <ul class="post-meta">
                            <li v-if="detail.wenhuachanpinTypes">文化产品类型：
                                {{detail.wenhuachanpinValue}}
                            </li>
                            <li v-if="detail.wenhuachanpinKucunNumber">文化产品库存：
                                {{detail.wenhuachanpinKucunNumber}}
                            </li>
                            <li v-if="detail.wenhuachanpinOldMoney">文化产品原价：
                                {{detail.wenhuachanpinOldMoney}}
                            </li>
                            <li v-if="detail.wenhuachanpinNewMoney">现价：
                                {{detail.wenhuachanpinNewMoney}}
                            </li>
                            <li v-if="detail.wenhuachanpinClicknum">点击次数：
                                {{detail.wenhuachanpinClicknum}}
                            </li>
                        </ul>


                        <ul class="post-meta">
                            <li>
                            </li>
                        </ul>

                        <div style="padding: 20px;border: 1px solid #f2f2f2;margin-top: 20px;display: flex">
                            <div class="num-picker">
        <!-- 座位 -->
                                <button type="button" onclick="reduceBuynumber()" class="layui-btn layui-btn-primary">
                                    -
                                </button>
                                <input type="text" id="buyNumber" name="buyNumber" class="layui-input" disabled="disabled" />
                                <button type="button" onclick="plusBuynumber()" class="layui-btn layui-btn-primary">
                                    +
                                </button>
                                <button onclick="addWenhuachanpinCart()" style="height:auto;" :style='{"padding":"0 10px","boxShadow":"0 0 6px rgba(255,0,0,.3)","margin":"0 5px","borderColor":"rgba(0,0,0,.3)","backgroundColor":"rgba(244, 121, 131, 1)","color":"rgba(240, 252, 255, 1)","borderRadius":"6px","borderWidth":"0","width":"auto","lineHeight":"40px","fontSize":"16px","borderStyle":"solid"}' type="button" class="layui-btn layui-btn-warm">
                                    添加到购物车
                                </button>
                                <button onclick="addWenhuachanpinOrder()" style="height:auto;" :style='{"padding":"0 10px","boxShadow":"0 0 0px rgba(255,0,0,.3)","margin":"0 5px","borderColor":"rgba(0,0,0,.3)","backgroundColor":"rgba(23, 124, 176, 1)","color":"rgba(255, 255, 255, 1)","borderRadius":"6px","borderWidth":"0","width":"auto","lineHeight":"40px","fontSize":"16px","borderStyle":"solid"}' type="button" class="layui-btn btn-submit">
                                    立即购买
                                </button>
                            </div>
                        </div>
                    </div>
                    <div class="blog-details-content"v-html="myFilters(detail.wenhuachanpinContent)">
                    </div>
                </div>
                <div class="comments-area" v-if="wenhuachanpinLiuyanDataList.length > 0">
                    <h3 class="title">
                        留言
                    </h3>
                    <ul class="comments-list">
                        <li class="single-comment" v-for="(item,index) in wenhuachanpinLiuyanDataList" v-bind:key="index">
                            <div class="thumb">
                                <img :src="item.yonghuPhoto" alt="image">
                            </div>
                            <div class="content">
                                <h6 class="name">{{item.yonghuName}}<span class="date" style="float:right">{{item.insertTime}}</span></h6>
                                <p>{{item.wenhuachanpinLiuyanText}}</p>
                            </div>
                            <p v-if="item.replyText != null && item.replyText != ''" style="font-size: 10px;color: #959797">
                                回复：{{ item.replyText }}</p>
                        </li>

                    </ul>
                </div>
                <div class="comment-form-area">
                    <h3 class="title">添加留言</h3>
                    <form class="comment-form">
                        <div class="row">
                            <div class="col-lg-12 form-group">
                                <textarea name="comment-message" id="wenhuachanpinLiuyanText" placeholder="留言内容"></textarea>
                            </div>
                            <div class="col-lg-12">
                                <button lay-submit lay-filter="wenhuachanpinLiuyanText" class="cmn-btn-border">提交</button>
                            </div>
                        </div>
                    </form>
                </div>
        </div>
        <div class="col-lg-4" v-if="wenhuachanpinRecommendList">
            <div class="sidebar">

                <div class="widget">
                    <h3 class="widget-title">系统推荐</h3>

                    <ul class="small-post-list">
                        <li class="small-post-single" v-for="(item,index) in wenhuachanpinRecommendList" v-bind:key="index" @click="jump('../wenhuachanpin/detail.jsp?id='+item.id)">
                            <div class="thumb"><img width="65px" :src="item.wenhuachanpinPhoto"  alt="image"></div>
                            <div class="content">
                                <a class="main_color" class="date">{{item.wenhuachanpinName}}</a>
                                <h6 v-if="item.wenhuachanpinNewMoney" class="post-title"><a style="color: red">{{item.wenhuachanpinNewMoney}}</a>RMB</h6>
                            </div>
                        </li>
                    </ul>
                </div>

            </div><!-- sidebar end -->
        </div>
    </div>
</section>    </div>

<script type="text/javascript" src="../../xznstatic/js/jquery.min.js"></script>
<script src="../../xznstatic/js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
<script src="../../layui/layui.js"></script>
<script src="../../js/vue.js"></script>
<!-- 组件配置信息 -->
<script src="../../js/config.js"></script>
<!-- 扩展插件配置信息 -->
<script src="../../modules/config.js"></script>
<!-- 工具方法 -->
<script src="../../js/utils.js"></script>

<script>
    Vue.prototype.myFilters= function (msg) {
        if(msg != null){
            return msg.replace(/\n/g, "<br>");
        }else{
            return "";
        }
    };
    var vue = new Vue({
        el: '#app',
        data: {
            // 轮播图
            swiperList: [],
            // 数据详情
            detail: {
                id: 0
            },
            // 商品标题
            title: '',

            storeupFlag: 0,//收藏 [0为收藏 1已收藏]
            //系统推荐
            wenhuachanpinRecommendList: [],
            dataList: [],
            // 加入购物车数量
            buyNumber: 1,
            // 当前详情页表
            detailTable: 'wenhuachanpin',
            // 留言列表
            wenhuachanpinLiuyanDataList: [],
        },
        //  清除定时器
        destroyed: function () {
            // 不知道具体作用
            // window.clearInterval(this.inter);
        },
        methods: {
            jump(url) {
                jump(url)
            }
        }
    });

    layui.use(['layer', 'form', 'element', 'carousel', 'http', 'jquery', 'laypage'], function () {
        var layer = layui.layer;
        var element = layui.element;
        var form = layui.form;
        var carousel = layui.carousel;
        var http = layui.http;
        var jquery = layui.jquery;
        var laypage = layui.laypage;

        var limit = 10;

        // 设置数量
        jquery('#buyNumber').val(vue.buyNumber);

        // 数据ID
        var id = http.getParam('id');
        vue.detail.id = id;
        // 当前详情
        http.request(`${vue.detailTable}/detail/` + id, 'get', {}, function (res) {
            // 详情信息
            vue.detail = res.data;
            vue.title = vue.detail.wenhuachanpinName;
           // 轮播图片
            vue.swiperList = vue.detail.wenhuachanpinPhoto ? vue.detail.wenhuachanpinPhoto.split(",") : [];
            var swiperItemHtml = '';
            for (let item of vue.swiperList) {
                swiperItemHtml +=
                        '<div>' +
                        '<img class="swiper-item" src="' + item + '" style="margin-top: 50px;" >' +
                        '</div>';
            }
            jquery('#swiper-item').html(swiperItemHtml);
            // 轮播图
            carousel.render({
                elem: '#swiper',
                width: swiper.width, height: swiper.height,
                arrow: swiper.arrow,
                anim: swiper.anim,
                interval: swiper.interval,
                indicator: swiper.indicator
            });
        });

        // 系统推荐
        http.request(`wenhuachanpin/list`, 'get', {
            page: 1,
            limit: 5,
            wenhuachanpinTypes: vue.detail.wenhuachanpinTypes,
            wenhuachanpinDelete: 1,



                shangxiaTypes: vue.detail.shangxiaTypes,


        }, function (res) {
            vue.wenhuachanpinRecommendList = res.data.list;
        });

        // 获取留言
        http.request(`${vue.detailTable}Liuyan/list`, 'get', {
            page: 1,
            limit: limit,
            wenhuachanpinId: vue.detail.id
        }, function (res) {
            vue.wenhuachanpinLiuyanDataList = res.data.list;
            // 分页
            laypage.render({
                elem: 'wenhuachanpinLiuyanPager',
                count: res.data.total,
                limit: limit,
                jump: function (obj, first) {
                    //首次不执行
                    if (!first) {
                        http.request(`${vue.detailTable}Liuyan/list`, 'get', {
                            page: obj.curr,
                            limit: obj.limit,
                            wenhuachanpinId: vue.detail.id
                        }, function (res) {
                            vue.wenhuachanpinLiuyanDataList = res.data.list
                        })
                    }
                }
            });
        });

        // 提交留言
        form.on('submit(wenhuachanpinLiuyanText)', function (data) {
            data.yonghuId = localStorage.getItem('userid');
            data.tableName = localStorage.getItem('userTable');
            data.wenhuachanpinLiuyanText =jquery("#wenhuachanpinLiuyanText").val();
            if(data.wenhuachanpinLiuyanText == null || data.wenhuachanpinLiuyanText == ''){
                layer.msg("留言不能为空", {
                    time: 2000,
                    icon: 2
                });
                return false;
            }
            data.wenhuachanpinId = vue.detail.id;
            http.requestJson(`${vue.detailTable}Liuyan/add`, 'post', data, function (res) {
                layer.msg('留言成功', {
                    time: 2000,
                    icon: 6
                }, function () {
                    window.location.reload();
                });
                return false
            });
            return false
        });


        if (localStorage.getItem('userid')) {
            http.request('wenhuachanpinCollection/list', 'get', {
                page: 1,
                limit: 1,
                wenhuachanpinId: vue.detail.id,
                yonghuId: localStorage.getItem('userid'),
            }, function (res) {
                if(res.data.total >0){
                    res.data.list.forEach(element => {
                        if (element.wenhuachanpinCollectionTypes == 1) {
                            vue.storeupFlag = 1;
                        }
                        if (element.wenhuachanpinCollectionTypes == 2) {
                            vue.zanFlag = 1;
                        }
                        if (element.wenhuachanpinCollectionTypes == 3) {
                            vue.caiFlag = 1;
                        }
                    });

                }
            });
        }

    });



    // 收藏
    function addWenhuachanpinCollection(){
        layui.http.request('wenhuachanpinCollection/list', 'get', {
            page: 1,
            limit: 1,
            wenhuachanpinId: vue.detail.id,
            wenhuachanpinCollectionTypes: 1,
            yonghuId: localStorage.getItem('userid'),
        }, (res) => {
            if (res.data.list.length == 1) {
                layui.http.requestJson('wenhuachanpinCollection/delete', 'post', [res.data.list[0].id], function (res) {
                    layui.layer.msg('取消成功', {
                        time: 1000,
                        icon: 5
                    }, function () {
                        window.location.reload();
                    });
                });
                return false;
            }
            layui.http.requestJson('wenhuachanpinCollection/add', 'post', {
                yonghuId: localStorage.getItem('userid'),
                wenhuachanpinId: vue.detail.id,
                wenhuachanpinCollectionTypes: 1,
            }, function (res) {
                layui.layer.msg('收藏成功', {
                    time: 1000,
                    icon: 6
                }, function () {
                    window.location.reload();
                });
            });
        });
    }

    // 添加数量
    function plusBuynumber() {
        vue.buyNumber++;
        layui.jquery('#buyNumber').val(vue.buyNumber);
    }
    // 减少数量
    function reduceBuynumber() {
        if(vue.buyNumber>1){
            vue.buyNumber--;
        }
        layui.jquery('#buyNumber').val(vue.buyNumber);
    }

    // 添加到购物车
    function addWenhuachanpinCart(){
        if (vue.detail.wenhuachanpinKucunNumber > 0 && vue.detail.wenhuachanpinKucunNumber < vue.buyNumber) {
            layer.msg(`库存不足`, {
                time: 2000,
                icon: 5
            });
            return false;
        }
        // 查询是否已经添加到购物车
        layui.http.request('cart/list', 'get', {
            yonghuId: localStorage.getItem('userid'),
            wenhuachanpinId: vue.detail.id
        }, (res) => {
            if(res.data.list.length > 0){
                layer.msg("该文化产品已经添加到购物车", {
                    time: 2000,
                    icon: 5
                });
                return false
            }
            layui.http.requestJson(`cart/add`, 'post', {
                yonghuId : localStorage.getItem('userid'),
                wenhuachanpinId : vue.detail.id,
                buyNumber: vue.buyNumber,
            }, function (res) {
                if(res.code==0){
                    layer.msg('添加到购物车成功', {
                        time: 2000,
                        icon: 6
                    });
                }else{
                    layer.msg(res.msg, {
                        time: 2000,
                        icon: 2
                    });
                }
            });
        })
    }

    // 立即购买
    function addWenhuachanpinOrder(){
        if (vue.detail.wenhuachanpinKucunNumber > 0 && vue.detail.wenhuachanpinKucunNumber < vue.buyNumber) {
            layer.msg(`文化产品库存不足`, {
                time: 2000,
                icon: 5
            });
            return false;
        }
        // 保存到storage中，在确认下单页面中获取要购买的物品
        localStorage.setItem('wenhuachanpins', JSON.stringify([{
            wenhuachanpinId: vue.detail.id,
            wenhuachanpinName: vue.detail.wenhuachanpinName,
            wenhuachanpinPhoto: vue.detail.wenhuachanpinPhoto,
            wenhuachanpinTypes: vue.detail.wenhuachanpinTypes,
            wenhuachanpinKucunNumber: vue.detail.wenhuachanpinKucunNumber,
            wenhuachanpinOldMoney: vue.detail.wenhuachanpinOldMoney,
            wenhuachanpinNewMoney: vue.detail.wenhuachanpinNewMoney,
            wenhuachanpinContent: vue.detail.wenhuachanpinContent,
            shangxiaTypes: vue.detail.shangxiaTypes,
            wenhuachanpinClicknum: vue.detail.wenhuachanpinClicknum,
            wenhuachanpinDelete: vue.detail.wenhuachanpinDelete,
            createTime: vue.detail.createTime,
            buyNumber: vue.buyNumber,
            yonghuId: localStorage.getItem('userid'),
        }]));
        // 跳转到确认下单页面
        jump('../wenhuachanpinOrder/confirm.jsp');
    }



</script>
</body>
</html>
