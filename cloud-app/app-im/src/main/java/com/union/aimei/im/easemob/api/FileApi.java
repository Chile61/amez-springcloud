package com.union.aimei.im.easemob.api;

/**
 * 文件API
 *
 * @author liurenkai
 * @time 2018/8/13 15:26
 */
public interface FileApi {

    /**
     * 上传文件 <br>
     * POST
     *
     * @param file 上传的文件对象，可以是地址、流等，以实现类为准
     * @return
     */
    Object uploadFile(Object file);

    /**
     * 下载文件 <br>
     * GET
     *
     * @param fileUUID    文件唯一标识，从上传Response-entities-uuid中获取
     * @param shareSecret 文件访问秘钥，从上传Response-entities-share-secret中获取
     * @param isThumbnail ，如果下载图片，是否为缩略图
     * @return
     */
    Object downloadFile(String fileUUID, String shareSecret, Boolean isThumbnail);
}
