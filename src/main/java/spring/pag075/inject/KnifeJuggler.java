package spring.pag075.inject;

import java.util.HashSet;
import java.util.Set;

import javax.inject.Inject;
import javax.inject.Provider;

public class KnifeJuggler {
  private Set<Knife> knives;

  @Inject 
  public KnifeJuggler(Provider<Knife> knifeProvider) {
    knives = new HashSet<Knife>();
    for (int i = 0; i < 5; i++) {
      knives.add(knifeProvider.get());
    }
  }
  
  public Set<Knife> getKnives() {
    return knives;
  }
}
