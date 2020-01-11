package ru.job4j.stream;

import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {

    @Test
    public void listProfilesToListAddress() {
        Profiles profiles = new Profiles();
        List<Profile> prf = Collections.singletonList(new Profile(new Address("Moscow", "Arbat", 10, 45)));
        List<Address> result = profiles.collect(prf);
        assertThat(result.get(0).getCity(), is("Moscow"));
    }

}