package com.wangsan.test.service;

/**
 * @author wangsan
 * @date 2017/10/10
 */
public class Image {

    private Long id;
    private String imageBase64;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImageBase64() {
        return imageBase64;
    }

    public void setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Image{");
        sb.append("id=").append(id);
        sb.append(", imageBase64='").append(imageBase64).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
