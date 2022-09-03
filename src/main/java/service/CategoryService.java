package service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.entity.Category;

import java.util.stream.IntStream;

public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}
