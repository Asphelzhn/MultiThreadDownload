package com.aspsine.multithreaddownload.demo;


import com.aspsine.multithreaddownload.demo.entity.AppInfo;

import java.util.ArrayList;
import java.util.List;

public class DataSource {

    private static DataSource sDataSource = new DataSource();

    private static final String[] NAMES = {
            "格瓦拉-自己",
            "格瓦拉-应用宝",
            "格瓦拉-FIR",

            "网易云音乐",
            "优酷",
            "腾讯视频",
            "UC浏览器",
            "360手机卫士",
            "前程无忧51job",
            "搜狐视频",
            "微信电话本",
            "淘宝",
            "聚美优品",
            "搜房网"
    };

    private static final String[] IMAGES = {
            "http://pp.myapp.com/ma_icon/0/icon_5034_1471514862/96",
            "http://pp.myapp.com/ma_icon/0/icon_5034_1471514862/96",
            "http://firicon.fir.im/09908021dc7454364a4266ca1334145acd5a0bcd",

            "http://img.wdjimg.com/mms/icon/v1/d/f1/1c8ebc9ca51390cf67d1c3c3d3298f1d_512_512.png",
            "http://img.wdjimg.com/mms/icon/v1/3/2d/dc14dd1e40b8e561eae91584432262d3_512_512.png",
            "http://img.wdjimg.com/mms/icon/v1/8/10/1b26d9f0a258255b0431c03a21c0d108_512_512.png",
            "http://img.wdjimg.com/mms/icon/v1/3/89/9f5f869c0b6a14d5132550176c761893_512_512.png",
            "http://img.wdjimg.com/mms/icon/v1/d/29/dc596253e9e80f28ddc84fe6e52b929d_512_512.png",
            "http://img.wdjimg.com/mms/icon/v1/e/d0/03a49009c73496fb8ba6f779fec99d0e_512_512.png",
            "http://img.wdjimg.com/mms/icon/v1/2/bf/939a67b179e75326aa932fc476cbdbf2_512_512.png",
            "http://img.wdjimg.com/mms/icon/v1/b/fe/718d7c213ce633fd4e25c278c19acfeb_512_512.png",
            "http://img.wdjimg.com/mms/icon/v1/f/29/cf90d1294ac84da3b49561a6f304029f_512_512.png",
            "http://img.wdjimg.com/mms/icon/v1/4/43/0318ce32731600bfa66cbb5018e1a434_512_512.png",
            "http://img.wdjimg.com/mms/icon/v1/7/08/2b3858e31efdee8a7f28b06bdb83a087_512_512.png"
    };

    private static final String[] URLS = {
            "http://img5.gewara.com/upload/apk/201609/gewara_v7.1.0.apk?v=1473142184331",
            "http://imtt.dd.qq.com/16891/2ED1B174F59B26D50A7801F4F3332254.apk?fsname=com.gewara_7.0.1_69.apk&csr=4d5s",
            "http://pkg3.fir.im/a2a3389b2f2bd75ca1c3e9cb318892fbb6c24030.apk?attname=gewara_v7.1.0_2016-09-05_AS04.apk_7.1.0.apk",

            "http://s1.music.126.net/download/android/CloudMusic_2.8.1_official_4.apk",
            "http://dl.m.cc.youku.com/android/phone/Youku_Phone_youkuweb.apk",
            "http://dldir1.qq.com/qqmi/TencentVideo_V4.1.0.8897_51.apk",
            "http://wap3.ucweb.com/files/UCBrowser/zh-cn/999/UCBrowser_V10.6.0.620_android_pf145_(Build150721222435).apk",
            "http://msoftdl.360.cn/mobilesafe/shouji360/360safesis/360MobileSafe_6.2.3.1060.apk",
            "http://www.51job.com/client/51job_51JOB_1_AND2.9.3.apk",
            "http://upgrade.m.tv.sohu.com/channels/hdv/5.0.0/SohuTV_5.0.0_47_201506112011.apk",
            "http://dldir1.qq.com/qqcontacts/100001_phonebook_4.0.0_3148.apk",
            "http://download.alicdn.com/wireless/taobao4android/latest/702757.apk",
            "http://apps.wandoujia.com/apps/com.jm.android.jumei/download",
            "http://download.3g.fang.com/soufun_android_30001_7.9.0.apk"
    };

    public static DataSource getInstance() {
        return sDataSource;
    }

    public List<AppInfo> getData() {
        List<AppInfo> appInfos = new ArrayList<AppInfo>();
        for (int i = 0; i < NAMES.length; i++) {
            AppInfo appInfo = new AppInfo(String.valueOf(i), NAMES[i], IMAGES[i], URLS[i]);
            appInfos.add(appInfo);
        }
        return appInfos;
    }
}
