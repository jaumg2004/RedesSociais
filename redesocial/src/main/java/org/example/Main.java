package org.example;

import org.example.Exception.CheckedException;
import org.example.Exception.UncheckedException;

import java.util.HashSet;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashSet<RedeSocial> redeSocialHashSet = new HashSet<>();
        Usuario usuario = new Usuario(redeSocialHashSet);
        String nome;
        String email;
        int menu = 0;

        System.out.println("Crie uma conta de usuário com nome e email");
        nome = scanner.nextLine();
        email = scanner.nextLine();

        usuario.setEmail(email);
        usuario.setNome(nome);

        System.out.println("Escolha uma rede social para entrar");
        System.out.println("1-Instagram");
        System.out.println("2-Facebook");
        System.out.println("3-Google+");
        System.out.println("4-Twitter");

        menu = scanner.nextInt();

        try {
            while (menu != 5) {
                switch (menu) {
                    case 1:
                        System.out.println("Digite a senha");
                        String password1 = getPasswordFromUser(scanner);
                        int numAmigos1 = 0;
                        Instagram insta = new Instagram(password1, numAmigos1);
                        while (insta.compareTo(insta) == 1) {
                            System.out.println("Senha existente! Digite outra");
                            password1 = getPasswordFromUser(scanner);
                        }
                        redeSocialHashSet.add(insta);

                        int opcao1 = 0;
                        System.out.println("O que deseja fazer?");
                        System.out.println("1-curtir");
                        System.out.println("2-postar vídeo");
                        System.out.println("3-postar foto");
                        System.out.println("4-postar comentário");
                        while (opcao1 != 5) {
                            switch (opcao1) {
                                case 1:
                                    insta.curtirPublicacao();
                                    insta.setNumAmigos(insta.getNumAmigos() + 1);
                                    break;
                                case 2:
                                    insta.postarVideo();
                                    insta.setNumAmigos(insta.getNumAmigos() + 1);
                                    break;

                                case 3:
                                    insta.postarFoto();
                                    insta.setNumAmigos(insta.getNumAmigos() + 1);
                                    break;
                                case 4:
                                    insta.postarComentario();
                                    insta.setNumAmigos(insta.getNumAmigos() + 1);
                                    break;
                            }
                            System.out.println("Aproveite as outras opções, ou aperte 5 pra sair do insta");
                            opcao1 = scanner.nextInt();
                            scanner.nextLine();
                        }
                        break;
                    case 2:
                        System.out.println("Digite a senha");
                        String password2 = getPasswordFromUser(scanner);
                        int numAmigos2 = 0;
                        Facebook face = new Facebook(password2, numAmigos2);
                        while (face.compareTo(face) == 1) {
                            System.out.println("Senha existente! Digite outra");
                            password2 = getPasswordFromUser(scanner);
                        }
                        redeSocialHashSet.add(face);

                        int opcao2 = 0;
                        System.out.println("O que deseja fazer?");
                        System.out.println("1-curtir");
                        System.out.println("2-postar vídeo");
                        System.out.println("3-postar foto");
                        System.out.println("4-postar comentário");
                        System.out.println("5-compartilhar");
                        System.out.println("6-abrir uma live");
                        while (opcao2 != 7) {
                            switch (opcao2) {
                                case 1:
                                    face.curtirPublicacao();
                                    face.setNumAmigos(face.getNumAmigos() + 1);
                                    break;
                                case 2:
                                    face.postarVideo();
                                    face.setNumAmigos(face.getNumAmigos() + 1);
                                    break;

                                case 3:
                                    face.postarFoto();
                                    face.setNumAmigos(face.getNumAmigos() + 1);
                                    break;
                                case 4:
                                    face.postarComentario();
                                    face.setNumAmigos(face.getNumAmigos() + 1);
                                    break;
                                case 5:
                                    face.compartilhar();
                                    face.setNumAmigos(face.getNumAmigos() + 1);
                                    break;
                                case 6:
                                    face.fazStreaming();
                                    face.setNumAmigos(face.getNumAmigos() + 1);
                                    break;
                            }
                            System.out.println("Aproveite as outras opções, ou aperte 7 pra sair do insta");
                            opcao2 = scanner.nextInt();
                            scanner.nextLine();
                        }
                        break;
                    case 3:
                        System.out.println("Digite a senha");
                        String password3 = getPasswordFromUser(scanner);
                        int numAmigos3 = 0;
                        GooglePlus googlePlus = new GooglePlus(password3, numAmigos3);
                        while (googlePlus.compareTo(googlePlus) == 1) {
                            System.out.println("Senha existente! Digite outra");
                            password3 = getPasswordFromUser(scanner);
                        }
                        redeSocialHashSet.add(googlePlus);

                        int opcao3 = 0;
                        System.out.println("O que deseja fazer?");
                        System.out.println("1-curtir");
                        System.out.println("2-postar vídeo");
                        System.out.println("3-postar foto");
                        System.out.println("4-postar comentário");
                        System.out.println("5-compartilhar");
                        System.out.println("6-abrir uma live");
                        while (opcao3 != 7) {
                            switch (opcao3) {
                                case 1:
                                    googlePlus.curtirPublicacao();
                                    googlePlus.setNumAmigos(googlePlus.getNumAmigos() + 1);
                                    break;
                                case 2:
                                    googlePlus.postarVideo();
                                    googlePlus.setNumAmigos(googlePlus.getNumAmigos() + 1);
                                    break;

                                case 3:
                                    googlePlus.postarFoto();
                                    googlePlus.setNumAmigos(googlePlus.getNumAmigos() + 1);
                                    break;
                                case 4:
                                    googlePlus.postarComentario();
                                    googlePlus.setNumAmigos(googlePlus.getNumAmigos() + 1);
                                    break;
                                case 5:
                                    googlePlus.compartilhar();
                                    googlePlus.setNumAmigos(googlePlus.getNumAmigos() + 1);
                                    break;
                                case 6:
                                    googlePlus.fazStreaming();
                                    googlePlus.setNumAmigos(googlePlus.getNumAmigos() + 1);
                                    break;
                            }
                            System.out.println("Aproveite as outras opções, ou aperte 7 pra sair do insta");
                            opcao3 = scanner.nextInt();
                            scanner.nextLine();
                        }
                        break;
                    case 4:
                        System.out.println("Digite a senha");
                        String password4 = getPasswordFromUser(scanner);
                        int numAmigos4 = 0;
                        Twitter twitter = new Twitter(password4, numAmigos4);
                        while (twitter.compareTo(twitter) == 1) {
                            System.out.println("Senha existente! Digite outra");
                            password4 = getPasswordFromUser(scanner);
                        }
                        redeSocialHashSet.add(twitter);

                        int opcao4 = 0;
                        System.out.println("O que deseja fazer?");
                        System.out.println("1-curtir");
                        System.out.println("2-postar vídeo");
                        System.out.println("3-postar foto");
                        System.out.println("4-postar comentário");
                        System.out.println("5-compartilhar");
                        while (opcao4 != 6) {
                            switch (opcao4) {
                                case 1:
                                    twitter.curtirPublicacao();
                                    twitter.setNumAmigos(twitter.getNumAmigos() + 1);
                                    break;
                                case 2:
                                    twitter.postarVideo();
                                    twitter.setNumAmigos(twitter.getNumAmigos() + 1);
                                    break;

                                case 3:
                                    twitter.postarFoto();
                                    twitter.setNumAmigos(twitter.getNumAmigos() + 1);
                                    break;
                                case 4:
                                    twitter.postarComentario();
                                    twitter.setNumAmigos(twitter.getNumAmigos() + 1);
                                    break;
                                case 5:
                                    twitter.compartilhar();
                                    twitter.setNumAmigos(twitter.getNumAmigos() + 1);
                                    break;

                            }
                            System.out.println("Aproveite as outras opções, ou aperte 6 pra sair do insta");
                            opcao4 = scanner.nextInt();
                            scanner.nextLine();
                        }
                        break;

                }
                System.out.println("Escolha uma rede social para entrar (ou 5 para sair)");
                menu = scanner.nextInt();
                scanner.nextLine();
            }
        } catch (CheckedException e) {
            System.out.println("Exceção checked capturada: " + e.getMessage());
        } catch (UncheckedException e) {
            System.out.println("Exceção unchecked capturada: " + e.getMessage());
        }

    }

    private static String getPasswordFromUser(Scanner scanner) {
        System.out.print("Password: ");
        return scanner.nextLine();
    }
}
