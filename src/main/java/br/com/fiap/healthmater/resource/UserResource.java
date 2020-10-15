package br.com.fiap.healthmater.resource;

import br.com.fiap.healthmater.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Define all the {@link User} resources that will be exposed by the Controller classes.
 *
 * @author Gabriel Oliveira
 */
public interface UserResource {

    @GetMapping("{id}")
    public User findById(@PathVariable("id") Integer id);

}
