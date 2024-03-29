package service;

import com.example.summertrudvang.domain.RuleBook;
import com.example.summertrudvang.repository.RuleBookRepository;
import com.example.summertrudvang.service.RuleBookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RuleBookServiceTest {
    private RuleBook ruleBook;

    @Autowired
    private RuleBookService ruleBookService;

    @Autowired
    private RuleBookRepository ruleBookRepository;

    @Test
    public void createRuleBookWithContent(){
        ruleBook = new RuleBook("testCode", "testName");
        ruleBookService.createRuleBook("testCode", "testName");
        RuleBook testBook = ruleBookService.findByBookName("testCode");
        assertEquals(testBook.getCode(), ruleBook.getCode());
        assertEquals(testBook.getName(), ruleBook.getName());
    }

}
