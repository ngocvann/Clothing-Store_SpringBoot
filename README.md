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

```plaintext
Shopping_Cart_Clothes/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── ecom/
│   │   │           ├── config/
│   │   │           ├── controller/
│   │   │           ├── model/
│   │   │           ├── repository/
│   │   │           ├── service/
│   │   │           ├── util/
│   │   │           └── application.java
│   │   ├── resources/
│   │   │   ├── static/
│   │   │   │   ├── css/
│   │   │   │   ├── img/
│   │   │   │   └── js/
│   │   │   ├── template/
│   │   │   │   ├── admin/
│   │   │   │   └── user/
│   │   │   └── application.properties
│   └── test/
│       └── java/
│           └── com/
│               └── ecom/
│                   └── ClothesShopApplicationTests.java
├── pom.xml
└── README.md
```

## 📦 Hướng Dẫn Cài Đặt Dự Án

### 1️⃣ Yêu Cầu Hệ Thống
Để triển khai và chạy dự án, bạn cần đảm bảo các công cụ sau được cài đặt trên máy tính:
1. **Java JDK 17**: [Cài đặt từ Amazon Corretto](https://aws.amazon.com/corretto/).
2. **Maven**: [Cài đặt từ Maven Official Website](https://maven.apache.org/).
3. **MySQL**: Cài đặt và tạo cơ sở dữ liệu cho ứng dụng.
4. **IDE**: Sử dụng IntelliJ IDEA hoặc Eclipse.

### 2️⃣ Cách Triển Khai Dự Án
#### Clone Repository
Sao chép mã nguồn từ GitHub bằng lệnh sau:
```bash
git clone https://github.com/ngocvann/Clothing-Store_SpringBoot.git
```
#### Cài Đặt Dependencies
Truy cập vào thư mục dự án vừa clone và chạy lệnh Maven để cài đặt các thư viện cần thiết:
```bash
mvn clean install
```
### Cấu Hình Cơ Sở Dữ Liệu 💾
1. **Mở MySQL và tạo cơ sở dữ liệu với tên phù hợp, ví dụ: shopping_cart_clothes.**
2. **Cập nhật file application.properties trong thư mục src/main/resources với thông tin kết nối MySQL của bạn:**
```bash
spring.application.name=Shopping_Cart_Clothes
spring.datasource.url=jdbc:mysql://localhost:3306/shopping_cart_clothes
spring.datasource.username= root
spring.datasource.password=<your_password>
```
Lưu ý: Thay <your_password> bằng mật khẩu MySQL của bạn.

### 4️⃣ Khởi Chạy Ứng Dụng
Sử dụng lệnh sau để khởi động ứng dụng:
```bash
mvn spring-boot:run
```
Sau khi ứng dụng khởi chạy thành công, bạn có thể truy cập website tại:
```bash
http://localhost:8081
```
## 📝 Đánh Giá và Phản Hồi

Mình rất mong nhận được ý kiến đóng góp của bạn để cải thiện sản phẩm. Nếu bạn có bất kỳ ý tưởng, phản hồi hoặc phát hiện lỗi nào, hãy liên hệ hoặc gửi issue trên GitHub.

Nếu có bất kỳ thắc mắc nào trong quá trình cài đặt, vui lòng tham khảo tài liệu hoặc liên hệ qua các kênh hỗ trợ được liệt kê trong repository này. 🎉

