package org.ofdrw.core.basicStructure.ofd;

import org.dom4j.Element;

import java.util.List;

/**
 * OFD 档案应用主入口扩展类
 * <p>
 * 专门用于满足《信息技术 OFD档案应用指南 GB/T 42133-2022》中关于 DOC_TYPE 为 "OFD-A" 的要求。
 */
public class OFDA extends OFD {

    /**
     * 文件格式子集类型，取值为“OFD-A”
     */
    public static final String DOC_TYPE_OFD_A = "OFD-A";

    public OFDA(Element proxy) {
        super(proxy);
    }

    public OFDA() {
        super();
        this.addAttribute("DocType", DOC_TYPE_OFD_A);
    }

    /**
     * 文件对象入口列表创建文档对象
     *
     * @param docBodies 文件对象入口序列
     */
    public OFDA(List<DocBody> docBodies) {
        this();
        for (DocBody item : docBodies) {
            if (item != null) {
                this.add(item);
            }
        }
    }

    /**
     * 文件对象入口创建文档对象
     *
     * @param docBody 文件对象入口
     */
    public OFDA(DocBody docBody) {
        this();
        this.add(docBody);
    }

    /**
     * 【必选 属性】设置 文件版本号
     *
     * @param version 版本号
     * @return this (OFDA 实例)
     */
    @Override
    public OFDA setVersion(String version) {
        super.setVersion(version);
        return this;
    }

    /**
     * 【必选】增加文件对象入口。
     * 文件对象入口，可以存在多个，以便在一个文档中包含多个版式文档
     *
     * @param docBody 文件对象入口
     * @return this (OFDA 实例)
     */
    @Override
    public OFDA addDocBody(DocBody docBody) {
        super.addDocBody(docBody);
        return this;
    }
}