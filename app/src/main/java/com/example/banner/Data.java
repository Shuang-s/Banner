package com.example.banner;

import java.util.List;

/**
 * name:高爽
 * date:2017/6/22.
 * desc:
 */
public class Data {

    /**
     * code : 200
     * data : {"scheme":[],"infos":[{"action_type":0,"item_type":1,"action":"","title":"新版轮播图","banners":[{"target_app_url":"","good_price":"","sub_title":"","special_list_url":"","target_id":708,"pic":"http://f2.kkmh.com/image/170221/3g6oa91p7.webp","type":2,"target_package_name":"","hybrid_url":"","target_web_url":"","target_title":"你的血很甜2","id":943,"request_id":"-1","good_alias":"","chapter_count":8},{"target_app_url":"","good_price":"","sub_title":"","special_list_url":"","target_id":1110,"pic":"http://f2.kkmh.com/image/170524/uqiz4hxfr.webp","type":2,"target_package_name":"","hybrid_url":"","target_web_url":"","target_title":"养个孩子再恋爱","id":1627,"request_id":"-1","good_alias":"","chapter_count":8},{"target_app_url":"","good_price":"","sub_title":"","special_list_url":"","target_id":26212,"pic":"http://f2.kkmh.com/image/170620/sh9c6kot4.webp","type":3,"target_package_name":"","hybrid_url":"","target_web_url":"","target_title":"斗罗大陆","id":1892,"request_id":"-1","good_alias":"","chapter_count":8},{"target_app_url":"","good_price":"","sub_title":"","special_list_url":"","target_id":766,"pic":"http://f2.kkmh.com/image/170619/nll5h39yt.webp","type":2,"target_package_name":"","hybrid_url":"","target_web_url":"","target_title":"怦然心动","id":1887,"request_id":"-1","good_alias":"","chapter_count":8}]}]}
     * message : ok
     */

    private int code;
    private DataBean data;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class DataBean {
        private List<?> scheme;
        private List<InfosBean> infos;

        public List<?> getScheme() {
            return scheme;
        }

        public void setScheme(List<?> scheme) {
            this.scheme = scheme;
        }

        public List<InfosBean> getInfos() {
            return infos;
        }

        public void setInfos(List<InfosBean> infos) {
            this.infos = infos;
        }

        public static class InfosBean {
            /**
             * action_type : 0
             * item_type : 1
             * action :
             * title : 新版轮播图
             * banners : [{"target_app_url":"","good_price":"","sub_title":"","special_list_url":"","target_id":708,"pic":"http://f2.kkmh.com/image/170221/3g6oa91p7.webp","type":2,"target_package_name":"","hybrid_url":"","target_web_url":"","target_title":"你的血很甜2","id":943,"request_id":"-1","good_alias":"","chapter_count":8},{"target_app_url":"","good_price":"","sub_title":"","special_list_url":"","target_id":1110,"pic":"http://f2.kkmh.com/image/170524/uqiz4hxfr.webp","type":2,"target_package_name":"","hybrid_url":"","target_web_url":"","target_title":"养个孩子再恋爱","id":1627,"request_id":"-1","good_alias":"","chapter_count":8},{"target_app_url":"","good_price":"","sub_title":"","special_list_url":"","target_id":26212,"pic":"http://f2.kkmh.com/image/170620/sh9c6kot4.webp","type":3,"target_package_name":"","hybrid_url":"","target_web_url":"","target_title":"斗罗大陆","id":1892,"request_id":"-1","good_alias":"","chapter_count":8},{"target_app_url":"","good_price":"","sub_title":"","special_list_url":"","target_id":766,"pic":"http://f2.kkmh.com/image/170619/nll5h39yt.webp","type":2,"target_package_name":"","hybrid_url":"","target_web_url":"","target_title":"怦然心动","id":1887,"request_id":"-1","good_alias":"","chapter_count":8}]
             */

            private int action_type;
            private int item_type;
            private String action;
            private String title;
            private List<BannersBean> banners;

            public int getAction_type() {
                return action_type;
            }

            public void setAction_type(int action_type) {
                this.action_type = action_type;
            }

            public int getItem_type() {
                return item_type;
            }

            public void setItem_type(int item_type) {
                this.item_type = item_type;
            }

            public String getAction() {
                return action;
            }

            public void setAction(String action) {
                this.action = action;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public List<BannersBean> getBanners() {
                return banners;
            }

            public void setBanners(List<BannersBean> banners) {
                this.banners = banners;
            }

            public static class BannersBean {
                /**
                 * target_app_url :
                 * good_price :
                 * sub_title :
                 * special_list_url :
                 * target_id : 708
                 * pic : http://f2.kkmh.com/image/170221/3g6oa91p7.webp
                 * type : 2
                 * target_package_name :
                 * hybrid_url :
                 * target_web_url :
                 * target_title : 你的血很甜2
                 * id : 943
                 * request_id : -1
                 * good_alias :
                 * chapter_count : 8
                 */

                private String target_app_url;
                private String good_price;
                private String sub_title;
                private String special_list_url;
                private int target_id;
                private String pic;
                private int type;
                private String target_package_name;
                private String hybrid_url;
                private String target_web_url;
                private String target_title;
                private int id;
                private String request_id;
                private String good_alias;
                private int chapter_count;

                public String getTarget_app_url() {
                    return target_app_url;
                }

                public void setTarget_app_url(String target_app_url) {
                    this.target_app_url = target_app_url;
                }

                public String getGood_price() {
                    return good_price;
                }

                public void setGood_price(String good_price) {
                    this.good_price = good_price;
                }

                public String getSub_title() {
                    return sub_title;
                }

                public void setSub_title(String sub_title) {
                    this.sub_title = sub_title;
                }

                public String getSpecial_list_url() {
                    return special_list_url;
                }

                public void setSpecial_list_url(String special_list_url) {
                    this.special_list_url = special_list_url;
                }

                public int getTarget_id() {
                    return target_id;
                }

                public void setTarget_id(int target_id) {
                    this.target_id = target_id;
                }

                public String getPic() {
                    return pic;
                }

                public void setPic(String pic) {
                    this.pic = pic;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getTarget_package_name() {
                    return target_package_name;
                }

                public void setTarget_package_name(String target_package_name) {
                    this.target_package_name = target_package_name;
                }

                public String getHybrid_url() {
                    return hybrid_url;
                }

                public void setHybrid_url(String hybrid_url) {
                    this.hybrid_url = hybrid_url;
                }

                public String getTarget_web_url() {
                    return target_web_url;
                }

                public void setTarget_web_url(String target_web_url) {
                    this.target_web_url = target_web_url;
                }

                public String getTarget_title() {
                    return target_title;
                }

                public void setTarget_title(String target_title) {
                    this.target_title = target_title;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getRequest_id() {
                    return request_id;
                }

                public void setRequest_id(String request_id) {
                    this.request_id = request_id;
                }

                public String getGood_alias() {
                    return good_alias;
                }

                public void setGood_alias(String good_alias) {
                    this.good_alias = good_alias;
                }

                public int getChapter_count() {
                    return chapter_count;
                }

                public void setChapter_count(int chapter_count) {
                    this.chapter_count = chapter_count;
                }
            }
        }
    }
}
