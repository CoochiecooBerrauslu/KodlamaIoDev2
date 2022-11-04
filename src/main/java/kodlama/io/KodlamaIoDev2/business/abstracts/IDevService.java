package kodlama.io.KodlamaIoDev2.business.abstracts;
import kodlama.io.KodlamaIoDev2.entities.concretes.CodeDevs;

import java.util.List;
public interface IDevService {
    void add(String data);
    void update(String data);
    void delete(String data);
    List<CodeDevs> getall();

}
