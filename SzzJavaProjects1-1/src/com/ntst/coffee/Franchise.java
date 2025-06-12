package com.ntst.coffee;

import java.util.List;

// 声明一个名为Franchise的接口
public interface Franchise {
  
    // 定义一个方法，用于设置折扣率
    void Discount(double discountRate);

    // 定义一个方法，用于添加新产品
    void NewProduct(MenuItem menuItem);
  
    // 定义一个方法，用于获取菜单
    List<MenuItem> getMenu();

    // 定义一个方法，用于处理投诉
    void HandleComplaint(String complaint);
}
