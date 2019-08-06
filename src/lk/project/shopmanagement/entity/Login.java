/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.entity;

/**
 *
 * @author NIWANTHA
 */
public class Login {
    
   private String username;
   private String question;
   private String answer;
   private String password;

    public Login() {
    }

    public Login(String username, String question, String answer, String password) {
        this.username = username;
        this.question = question;
        this.answer = answer;
        this.password = password;
    }

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    

    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Login{" + "username=" + username + ", password=" + password + ", question=" + question + ", answer=" + answer + '}';
    }
   
    
}
