package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object ApplicationMobile
 **/
@ApiModel(description = "Object ApplicationMobile")
public class ApplicationMobileUpdate  {
  
  @SerializedName("token")
  private String token = null;
  @SerializedName("cor")
  private String cor = null;
  @SerializedName("som")
  private String som = null;
  @SerializedName("icone")
  private String icone = null;
  @SerializedName("certificado")
  private String certificado = null;
  @SerializedName("senha")
  private String senha = null;

  
  /**
   * Token of the Mobile Application
   **/
  @ApiModelProperty(value = "Token of the Mobile Application")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   * Color of the Mobile App Message
   **/
  @ApiModelProperty(value = "Color of the Mobile App Message")
  public String getCor() {
    return cor;
  }
  public void setCor(String cor) {
    this.cor = cor;
  }

  
  /**
   * Message Sound of the Mobile Application
   **/
  @ApiModelProperty(value = "Message Sound of the Mobile Application")
  public String getSom() {
    return som;
  }
  public void setSom(String som) {
    this.som = som;
  }

  
  /**
   * Icon of the Message Mobile Application
   **/
  @ApiModelProperty(value = "Icon of the Message Mobile Application")
  public String getIcone() {
    return icone;
  }
  public void setIcone(String icone) {
    this.icone = icone;
  }

  
  /**
   * Certificate of the Mobile Application
   **/
  @ApiModelProperty(value = "Certificate of the Mobile Application")
  public String getCertificado() {
    return certificado;
  }
  public void setCertificado(String certificado) {
    this.certificado = certificado;
  }

  
  /**
   * Password of the Application Mobile
   **/
  @ApiModelProperty(value = "Password of the Application Mobile")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationMobileUpdate {\n");
    
    sb.append("  token: ").append(token).append("\n");
    sb.append("  cor: ").append(cor).append("\n");
    sb.append("  som: ").append(som).append("\n");
    sb.append("  icone: ").append(icone).append("\n");
    sb.append("  certificado: ").append(certificado).append("\n");
    sb.append("  senha: ").append(senha).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
