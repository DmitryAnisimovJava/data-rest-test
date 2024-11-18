package com.dmitryprod.testdatarest.config;

import com.dmitryprod.testdatarest.entity.User;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class UserEntityProcessor implements RepresentationModelProcessor<EntityModel<User>> {

    @Override
    public EntityModel<User> process(EntityModel<User> model) {
        return EntityModel.of(model.getContent());
    }
}
