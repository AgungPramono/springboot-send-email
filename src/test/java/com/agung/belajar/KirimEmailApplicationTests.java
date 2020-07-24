package com.agung.belajar;

import com.agung.belajar.service.GmailApiService;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KirimEmailApplicationTests {

    @Autowired
    private GmailApiService gmailApiService;

    @Test
    public void testKirimEmail() {
        gmailApiService.sendMail(
                "Belajar GMail API",
                "arrahmanalkahfi94@gmail.com",
                "Email Percobaan" + LocalDateTime.now(),
                "Ini email percobaan dikirim dari aplikasi"
        );
    }
}
