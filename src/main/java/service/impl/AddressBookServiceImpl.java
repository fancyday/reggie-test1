package service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.entity.AddressBook;
import com.itheima.mapper.AddressBookMapper;
import org.springframework.stereotype.Service;
import service.AddressBookService;


@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {

}
