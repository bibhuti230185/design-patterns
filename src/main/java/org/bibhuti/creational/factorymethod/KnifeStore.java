package org.bibhuti.creational.factorymethod;

public abstract class KnifeStore {
 public Knife orderKnife(String knifeType) {
  Knife knife = createKnife(knifeType);
  knife.sharpen();
  knife.polish();
  knife.pack();
  return knife;
 }
 public abstract Knife createKnife(String knifeType);
}
