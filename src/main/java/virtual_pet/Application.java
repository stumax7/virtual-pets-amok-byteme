package virtual_pet;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Welcome to the cat shelter! We house organic and robotic cats. Would you like to see our cats? (Y/N)");
        Scanner input = new Scanner(System.in);
        String userInput1 = input.nextLine();
        if (userInput1.equals("Y")) {
                System.out.println("Here is a list of our cats:");
                OrganicCat orgCat1 = new OrganicCat("Ben", 10);
                OrganicCat orgCat2 = new OrganicCat("Noah", 10);
                OrganicCat orgCat3 = new OrganicCat("Brian", 10);
                RoboCat roboCat1 = new RoboCat("Stuart", 10);
                RoboCat roboCat2 = new RoboCat("Ernest", 10);

                CatShelter shelter = new CatShelter();
                shelter.addCat(orgCat1);
                shelter.addCat(orgCat2);
                shelter.addCat(orgCat3);
                shelter.addCat(roboCat1);
                shelter.addCat(roboCat2);

                for (String name : shelter.getCatNames().keySet()) {
                    Cat someCatFromTheList = shelter.getCatNames().get(name);
                    System.out.println(someCatFromTheList);
                }
            while (x == 1) {
                System.out.println("Would you like to interact with all cats or a single cat?[A/S]");
                String userInput2 = input.nextLine();
                if (userInput2.equals("A")) {
                    System.out.println("What action would you like to take?");
                    System.out.println("[play with all cats, feed all cats, take cats to vet, clean litter boxes, repair all robotic cats, recharge all robotic cats, shoot all laser beams]");
                    String userInputAction = input.nextLine();
                    if (userInputAction.equals("feed all cats")) {
                        shelter.feedAllCats();
                        for (String name : shelter.getCatNames().keySet()) {
                            Cat someCatFromTheList = shelter.getCatNames().get(name);
                            System.out.println(someCatFromTheList);
                        }
                    } else if (userInputAction.equals("play with all cats")) {
                        shelter.playWithAllCats();
                        for (String name : shelter.getCatNames().keySet()) {
                            Cat someCatFromTheList = shelter.getCatNames().get(name);
                            System.out.println(someCatFromTheList);
                        }
                    } else if (userInputAction.equals("take cats to vet")) {
                        shelter.takeAllCatsToVet();
                        for (String name : shelter.getCatNames().keySet()) {
                            Cat someCatFromTheList = shelter.getCatNames().get(name);
                            System.out.println(someCatFromTheList);
                        }
                    } else if (userInputAction.equals("clean litter boxes")) {
                        shelter.cleanAllLitterBoxes();
                        for (String name : shelter.getCatNames().keySet()) {
                            Cat someCatFromTheList = shelter.getCatNames().get(name);
                            System.out.println(someCatFromTheList);
                        }
                    } else if (userInputAction.equals("repair all robotic cats")) {
                        shelter.repairAllRoboCats();
                        for (String name : shelter.getCatNames().keySet()) {
                            Cat someCatFromTheList = shelter.getCatNames().get(name);
                            System.out.println(someCatFromTheList);
                        }
                    } else if (userInputAction.equals("recharge all robotic cats")) {
                        shelter.rechargeAllRoboCats();
                        for (String name : shelter.getCatNames().keySet()) {
                            Cat someCatFromTheList = shelter.getCatNames().get(name);
                            System.out.println(someCatFromTheList);
                        }
                    } else if (userInputAction.equals("shoot all laser beams")) {
                        shelter.shootAllLaserBeams();
                    }
                    for (String name : shelter.getCatNames().keySet()) {
                        Cat someCatFromTheList = shelter.getCatNames().get(name);
                        someCatFromTheList.tick();
                    }
                }

                else if (userInput2.equals("S")) {
                    System.out.println("Which cat would you like to interact with?");
                    String userInputCat = input.nextLine();
                    if (userInputCat.equals("Ben")) {
                        System.out.println("What action would you like to take? [play, feed, take cat to vet, clean litter box, adopt this cat]");
                        String userInputAction = input.nextLine();
                        if (userInputAction.equals("feed")) {
                            orgCat1.feed();
                            System.out.println(orgCat1);
                        } else if (userInputAction.equals("play")) {
                            orgCat1.play();
                            System.out.println(orgCat1);
                        } else if (userInputAction.equals("take cat to vet")) {
                            orgCat1.vetVisit();
                            System.out.println(orgCat1);
                        } else if (userInputAction.equals("clean litter box")) {
                            orgCat1.cleanLitterBox();
                            System.out.println(orgCat1);
                        } else if (userInputAction.equals("adopt this cat")) {
                            shelter.adoptCat(userInputCat);
                            System.out.println("Congratulations on adopting your cat. Here is a list of cats still in the shelter:");
                            for (String name : shelter.getCatNames().keySet()) {
                                Cat someCatFromTheList = shelter.getCatNames().get(name);
                                System.out.println(someCatFromTheList);
                            }
                        }
                        for (String name : shelter.getCatNames().keySet()) {
                            Cat someCatFromTheList = shelter.getCatNames().get(name);
                            someCatFromTheList.tick();
                        }
                    }
                    if (userInputCat.equals("Noah")) {
                        System.out.println("What action would you like to take? [play, feed, take cat to vet, clean litter box, adopt this cat]");
                        String userInputAction = input.nextLine();
                        if (userInputAction.equals("feed")) {
                            orgCat2.feed();
                            System.out.println(orgCat2);
                        } else if (userInputAction.equals("play")) {
                            orgCat2.play();
                            System.out.println(orgCat2);
                        } else if (userInputAction.equals("take cat to vet")) {
                            orgCat2.vetVisit();
                            System.out.println(orgCat2);
                        } else if (userInputAction.equals("clean litter box")) {
                            orgCat2.cleanLitterBox();
                            System.out.println(orgCat2);
                        } else if (userInputAction.equals("adopt this cat")) {
                            shelter.adoptCat(userInputCat);
                            System.out.println("Congratulations on adopting your cat. Here is a list of cats still in the shelter:");
                            for (String name : shelter.getCatNames().keySet()) {
                                Cat someCatFromTheList = shelter.getCatNames().get(name);
                                System.out.println(someCatFromTheList);
                            }
                        }
                        for (String name : shelter.getCatNames().keySet()) {
                            Cat someCatFromTheList = shelter.getCatNames().get(name);
                            someCatFromTheList.tick();
                        }
                    }
                    if (userInputCat.equals("Brian")) {
                        System.out.println("What action would you like to take? [play, feed, take cat to vet, clean litter box, adopt this cat]");
                        String userInputAction = input.nextLine();
                        if (userInputAction.equals("feed")) {
                            orgCat3.feed();
                            System.out.println(orgCat3);
                        } else if (userInputAction.equals("play")) {
                            orgCat3.play();
                            System.out.println(orgCat3);
                        } else if (userInputAction.equals("take cat to vet")) {
                            orgCat3.vetVisit();
                            System.out.println(orgCat3);
                        } else if (userInputAction.equals("clean litter box")) {
                            orgCat3.cleanLitterBox();
                            System.out.println(orgCat3);
                        } else if (userInputAction.equals("adopt this cat")) {
                            shelter.adoptCat(userInputCat);
                            System.out.println("Congratulations on adopting your cat. Here is a list of cats still in the shelter:");
                            for (String name : shelter.getCatNames().keySet()) {
                                Cat someCatFromTheList = shelter.getCatNames().get(name);
                                System.out.println(someCatFromTheList);
                            }
                        }
                        for (String name : shelter.getCatNames().keySet()) {
                            Cat someCatFromTheList = shelter.getCatNames().get(name);
                            someCatFromTheList.tick();
                        }
                    }
                    if (userInputCat.equals("Stuart")) {
                        System.out.println("What action would you like to take? [play, repair, recharge, laser beam, adopt this cat]");
                        String userInputAction = input.nextLine();
                        if (userInputAction.equals("play")) {
                            roboCat1.play();
                            System.out.println(roboCat1);
                        } else if (userInputAction.equals("repair")) {
                            roboCat1.repair();
                            System.out.println(roboCat1);
                        } else if (userInputAction.equals("recharge")) {
                            roboCat1.recharge();
                            System.out.println(roboCat1);
                        } else if (userInputAction.equals("laser beam")) {
                            roboCat1.laserBeam();
                        } else if (userInputAction.equals("adopt this cat")) {
                            shelter.adoptCat(userInputCat);
                            System.out.println("Congratulations on adopting your cat. Here is a list of cats still in the shelter:");
                            for (String name : shelter.getCatNames().keySet()) {
                                Cat someCatFromTheList = shelter.getCatNames().get(name);
                                System.out.println(someCatFromTheList);
                            }
                        }
                        for (String name : shelter.getCatNames().keySet()) {
                            Cat someCatFromTheList = shelter.getCatNames().get(name);
                            someCatFromTheList.tick();
                        }
                    }
                    if (userInputCat.equals("Ernest")) {
                        System.out.println("What action would you like to take? [play, repair, recharge, laser beam, adopt this cat]");
                        String userInputAction = input.nextLine();
                        if (userInputAction.equals("play")) {
                            roboCat2.play();
                            System.out.println(roboCat2);
                        } else if (userInputAction.equals("repair")) {
                            roboCat2.repair();
                            System.out.println(roboCat2);
                        } else if (userInputAction.equals("recharge")) {
                            roboCat2.recharge();
                            System.out.println(roboCat1);
                        } else if (userInputAction.equals("laser beam")) {
                            roboCat2.laserBeam();
                        } else if (userInputAction.equals("adopt this cat")) {
                            shelter.adoptCat(userInputCat);
                            System.out.println("Congratulations on adopting your cat. Here is a list of cats still in the shelter:");
                            for (String name : shelter.getCatNames().keySet()) {
                                Cat someCatFromTheList = shelter.getCatNames().get(name);
                                System.out.println(someCatFromTheList);
                            }
                            for (String name : shelter.getCatNames().keySet()) {
                                Cat someCatFromTheList = shelter.getCatNames().get(name);
                                someCatFromTheList.tick();
                            }
                        }else if(userInputAction.equals("exit")){
                            System.out.println("Thanks for visiting. Please come back!");
                            break;
                            }
                        }
                    }else if(userInput2.equals("exit")){ System.out.println("Thanks for visiting. Please come back!"); break; }
                }


            } else{
                System.out.println("Ok. Goodbye.");
            }
        }
    }



