package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableJpaAuditing
public class KhoahocSpringboot implements ErrorController {

    public static void main(String[] args) {
        SpringApplication.run(KhoahocSpringboot.class, args);
    }

	public String getErrorPath() {
        return "/error";
    }

    @RequestMapping("/error")
    public String handleError() {
        // Xử lý lỗi ở đây (ví dụ: trả về một trang lỗi tùy chỉnh)
        return "error-page";
    }

    // Thêm các bean hoặc mã khác nếu cần

}
