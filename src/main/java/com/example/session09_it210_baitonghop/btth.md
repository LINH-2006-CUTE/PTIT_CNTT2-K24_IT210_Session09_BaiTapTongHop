* Phần 1 :
    1. Để giải quyết yêu cầu "hôm nay chọn Tiếng Anh, ngày mai mở lại vẫn là Tiếng Anh", bạn sẽ cấu hình Spring sử dụng SessionLocaleResolver hay CookieLocaleResolver? 
-> sử dụng CookieLocaleResolver vì Session sẽ bị xóa ngay khi khách đóng trình duyệt, còn Cookie có thể lưu trữ dữ liệu lâu dài trên ổ cứng người dùng
    2.   Tại sao lỗi ở Bẫy 1 (Khách lạ bị lỗi 400) lại xảy ra? Bạn sẽ thêm thuộc tính gì vào Annotation @CookieValue để cứu hệ thống thoát khỏi lỗi này?
-> thêm required = false để tránh  hệ thống không  tìm thấy cookie 