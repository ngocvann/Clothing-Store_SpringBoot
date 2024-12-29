# 🌐 XÂY DỰNG WEBSITE KINH DOANH THỜI TRANG 

<img width="942" alt="image" src="https://github.com/user-attachments/assets/1aae1f93-91d7-4391-be4b-a16d057063e9" />

<img width="942" alt="image" src="https://github.com/user-attachments/assets/56bac9c7-341a-4aeb-b6d9-2584b9bcb0c0" />
<img width="948" alt="image" src="https://github.com/user-attachments/assets/a89e1e28-528f-4154-9d1f-f979bad79819" />

---


<img width="943" alt="image" src="https://github.com/user-attachments/assets/5dc1d82b-206d-4d0b-b4da-069c8714a8f4" />

---

**Dự án này được xây dựng bởi [Nguyễn Ngô Ngọc Vân](https://github.com/ngocvann)**

---

## 🚀 Mô Tả Dự Án

Dự án này nhằm xây dựng một website bán hàng trực tuyến cho các sản phẩm thời trang, với các chức năng nổi bật sau:

- **Quản lý tài khoản người dùng**: Quản trị viên có thể kiểm soát các tài khoản người dùng và vô hiệu hóa tài khoản có hành vi bất thường.
- **Quản lý sản phẩm**: Cung cấp giao diện để thêm, xóa, sửa sản phẩm.
- **Quản lý danh mục sản phẩm**: Tạo, xóa và chỉnh sửa các danh mục sản phẩm.
- **Quản lý đơn hàng**: Quản trị viên có thể cập nhật trạng thái đơn hàng của khách hàng.
- **Tìm kiếm và lọc sản phẩm**: Người dùng có thể tìm kiếm và lọc sản phẩm theo nhiều tiêu chí như loại danh mục, tên sản phẩm, v.v.
- **Khuyến mãi và giảm giá**: Quản trị viên có thể thiết lập mã giảm giá cho sản phẩm.
- **Quản lý đơn hàng đã đặt**: Người dùng có thể xem chi tiết đơn hàng, trạng thái và hủy nếu cần.
- **Quản lý tài khoản cá nhân**: Người dùng có thể tạo tài khoản, đăng nhập và thay đổi thông tin cá nhân.

---

## 💻 Các Công Nghệ Sử Dụng

- **Frontend**: HTML, CSS, JavaScript, BootStrap (3, 4, 5), Thymeleaf
- **Backend**: Java (Spring Boot), Spring Security, Spring Data JPA
- **Database**: MySQL
- **Version Control**: Git, GitHub

---

## 🧑‍💻 Cấu Trúc Thư Mục Dự Án

Shopping_Cart_Clothes/ 
├── src/ 
│ ├── main/ 
│ │ ├── java/ 
│ │ │ └── com/ 
│ │ │ └── ecom/ 
│ │ │ ├── config/ 
│ │ │ ├── controller/ 
│ │ │ ├── model/ 
│ │ │ ├── repository/ 
│ │ │ ├── service/ 
│ │ │ ├── util/ 
│ │ │ └── application.java 
│ │ ├── resources/ 
│ │ │ ├── static/ 
│ │ │ │ ├── css/ 
│ │ │ │ ├── img/ 
│ │ │ │ └── js/ 
│ │ │ ├── template/ 
│ │ │ │ ├── admin/ 
│ │ │ │ ├── user/ 
│ │ │ └── application.properties 
│ └── test/ 
│ └── java/ 
│ └── com/ 
│ └── ecom/ 
│ └── ClothesShopApplicationTests.java
├── pom.xml 
└── README.md

---

## 📦 Cài Đặt Dự Án

### 💻 Cài Đặt Môi Trường Phát Triển

1. **Java JDK 17**: [Cài đặt từ Amazon Corretto](https://aws.amazon.com/corretto/).
2. **Maven**: [Cài đặt từ Maven Official Website](https://maven.apache.org/).
3. **MySQL**: Cài đặt và tạo cơ sở dữ liệu cho ứng dụng.
4. **IDE**: Sử dụng IntelliJ IDEA hoặc Eclipse.

### Clone Dự Án và Cài Đặt Dependencies 📦

```bash
git clone https://github.com/ngocvann/Clothing-Store_SpringBoot.git
mvn clean install
```
### Cấu Hình Cơ Sở Dữ Liệu 💾
Tạo cơ sở dữ liệu trong MySQL, ví dụ: shopping_cart_clothes.
Cập nhật thông tin kết nối trong application.properties:
properties
```bash
spring.application.name=Shopping_Cart_Clothes
spring.datasource.url=jdbc:mysql://localhost:3306/shopping_cart_clothes
spring.datasource.username= root
spring.datasource.password=<your_password>
```
Chạy Ứng Dụng 🚀
```bash
mvn spring-boot:run
```
Truy Cập Website 🌐
Mở trình duyệt và truy cập vào địa chỉ:
```bash
http://localhost:8081
```
📝 Đánh Giá và Phản Hồi
Mình rất mong nhận được phản hồi từ các bạn về các tính năng của website. Hãy chia sẻ suy nghĩ và góp ý của các bạn để mình có thể hoàn thiện sản phẩm hơn nữa!

🙌 Cảm Ơn Bạn!
Cảm ơn bạn đã theo dõi dự án của mình. Hy vọng bạn sẽ có những trải nghiệm tuyệt vời khi sử dụng sản phẩm! 🎉
