
package com.liangjt.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getAllCatResponse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="getAllCatResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://webService.liangjt.com/}stringCat" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllCatResponse", propOrder = {
    "_return"
})
public class GetAllCatResponse {

    @XmlElement(name = "return")
    protected StringCat _return;

    /**
     * ��ȡreturn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link StringCat }
     *     
     */
    public StringCat getReturn() {
        return _return;
    }

    /**
     * ����return���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link StringCat }
     *     
     */
    public void setReturn(StringCat value) {
        this._return = value;
    }

}
