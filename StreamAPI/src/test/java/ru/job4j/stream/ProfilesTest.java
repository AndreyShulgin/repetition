package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
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

    @Test
    public void whenGetAddressTwoSimilarToList() {
        Profiles profiles = new Profiles();
        List<Profile> profile = Arrays.asList(new Profile(new Address("London", "Arb", 10, 50)),
                new Profile(new Address("London", "Arb", 10, 50)));
        List<Address> result = profiles.collect(profile);
        assertThat(result.get(0).getCity(), is("London"));
        assertThat(result.size(), is(1));
    }

    @Test
    public void whenAddListAddressThenCompareToCity() {
        Profiles profiles = new Profiles();
        List<Profile> profile = new ArrayList<>();
        profile.add(new Profile(new Address("Moscow", "Arb", 10, 50)));
        profile.add(new Profile(new Address("London", "Arb", 10, 50)));
        profile.add(new Profile(new Address("Berlin", "Arb", 10, 50)));
        List<Address> result = profiles.collect(profile);
        assertThat(result.get(0).getCity(), is("Berlin"));
    }

}