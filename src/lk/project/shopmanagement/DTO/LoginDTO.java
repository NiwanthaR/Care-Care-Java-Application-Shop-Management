/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.project.shopmanagement.DTO;

/**
 *
 * @author NIWANTHA
 */
public class LoginDTO {
    
    private String username;
    private String question;
    private String answer;
    private String password;

    public LoginDTO(String username, String question, String answer, String password) {
        this.username = username;
        this.question = question;
        this.answer = answer;
        this.password = password;
    }

    public LoginDTO() {
    }

    public LoginDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Login_DTO{" + "username=" + username + ", question=" + question + ", answer=" + answer + ", password=" + password + '}';
    }
    
    
    
}
