package rs.edu.raf.mail;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import rs.edu.raf.korisnik.dto.IzmenaKorisnikaDTO;
import rs.edu.raf.korisnik.dto.NoviKorisnikDTO;
import rs.edu.raf.mail.servis.MailServiceImplementation;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class MailTest {

    @Autowired
    MailServiceImplementation mailServiceImplementation;

    @Test
    public void posaljiMailZaRegistracijuTest(){
        NoviKorisnikDTO kor = new NoviKorisnikDTO();
        kor.setPol("Z");
        kor.setPrezime("Rakic");
        kor.setEmail("mrakic8121rn@raf.rs");
        assertTrue(mailServiceImplementation.posaljiMailZaRegistraciju(kor, "123456"));
    }

    @Test
    public void posaljiMailZaPromenuLozinkeTest(){
        IzmenaKorisnikaDTO kor = new IzmenaKorisnikaDTO();
        kor.setPol("Z");
        kor.setPrezime("Rakic");
        kor.setEmail("mrakic8121rn@raf.rs");

        assertTrue(mailServiceImplementation.posaljiMailZaPromenuLozinke(kor, "123456"));
    }


}