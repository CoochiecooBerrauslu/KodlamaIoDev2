package kodlama.io.KodlamaIoDev2.business.concretes;

import kodlama.io.KodlamaIoDev2.business.abstracts.IDevService;
import kodlama.io.KodlamaIoDev2.dataAccess.abstracts.IDevRepository;
import kodlama.io.KodlamaIoDev2.entities.concretes.CodeDevs;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DevManager implements IDevService {
    private final IDevRepository iDevRepository;


    @Autowired
    public DevManager(IDevRepository iDevRepository) {
        this.iDevRepository = iDevRepository;
    }

    @Override
    public void add(String data) {

        System.out.println("Programming Language"+ data +"Added.");
    }

    @Override
    public void update(String data) {
        System.out.println("Programming Language"+ data +"Added.");

    }

    @Override
    public void delete(String data) {
        System.out.println("Programming Language"+ data +"Added.");

    }

    @Override
    public List<CodeDevs> getall() {

        return  ((IDevService) iDevRepository).getall();
    }

}
