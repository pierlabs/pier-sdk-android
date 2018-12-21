package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object ApplicatiooMobile
 **/
@ApiModel(description = "Object ApplicatiooMobile")
public class ApplicationMobilePersist  {
  
  @SerializedName("idPlataformaMobile")
  private Long idPlataformaMobile = null;
  @SerializedName("token")
  private String token = null;
  @SerializedName("cor")
  private String cor = null;
  @SerializedName("som")
  private String som = null;
  @SerializedName("icone")
  private String icone = null;
  @SerializedName("certificadoBase64")
  private String certificadoBase64 = null;
  @SerializedName("senha")
  private String senha = null;

  
  /**
   * Show the identifier of the platform
   **/
  @ApiModelProperty(value = "Show the identifier of the platform")
  public Long getIdPlataformaMobile() {
    return idPlataformaMobile;
  }
  public void setIdPlataformaMobile(Long idPlataformaMobile) {
    this.idPlataformaMobile = idPlataformaMobile;
  }

  
  /**
   * Present the token of the application
   **/
  @ApiModelProperty(value = "Present the token of the application")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   * Show the color of the application message
   **/
  @ApiModelProperty(value = "Show the color of the application message")
  public String getCor() {
    return cor;
  }
  public void setCor(String cor) {
    this.cor = cor;
  }

  
  /**
   * Show the message sound of the application
   **/
  @ApiModelProperty(value = "Show the message sound of the application")
  public String getSom() {
    return som;
  }
  public void setSom(String som) {
    this.som = som;
  }

  
  /**
   * Show the icon of the application message
   **/
  @ApiModelProperty(value = "Show the icon of the application message")
  public String getIcone() {
    return icone;
  }
  public void setIcone(String icone) {
    this.icone = icone;
  }

  
  /**
   * Show the certicated of the application
   **/
  @ApiModelProperty(value = "Show the certicated of the application")
  public String getCertificadoBase64() {
    return certificadoBase64;
  }
  public void setCertificadoBase64(String certificadoBase64) {
    this.certificadoBase64 = certificadoBase64;
  }

  
  /**
   * show the password of the application
   **/
  @ApiModelProperty(value = "show the password of the application")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationMobilePersist {\n");
    
    sb.append("  idPlataformaMobile: ").append(idPlataformaMobile).append("\n");
    sb.append("  token: ").append(token).append("\n");
    sb.append("  cor: ").append(cor).append("\n");
    sb.append("  som: ").append(som).append("\n");
    sb.append("  icone: ").append(icone).append("\n");
    sb.append("  certificadoBase64: ").append(certificadoBase64).append("\n");
    sb.append("  senha: ").append(senha).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
