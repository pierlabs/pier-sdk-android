package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Aplicacao Mobile
 **/
@ApiModel(description = "Aplicacao Mobile")
public class AplicacaoMobileResponse  {
  
  @SerializedName("id")
  private Long id = null;
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
   * Apresenta o identificador da aplicacao.
   **/
  @ApiModelProperty(value = "Apresenta o identificador da aplicacao.")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Apresenta o identificador da plataforma.
   **/
  @ApiModelProperty(value = "Apresenta o identificador da plataforma.")
  public Long getIdPlataformaMobile() {
    return idPlataformaMobile;
  }
  public void setIdPlataformaMobile(Long idPlataformaMobile) {
    this.idPlataformaMobile = idPlataformaMobile;
  }

  
  /**
   * Apresenta o token da aplicacao.
   **/
  @ApiModelProperty(value = "Apresenta o token da aplicacao.")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   * Apresenta a cor da mensagem da aplicacao.
   **/
  @ApiModelProperty(value = "Apresenta a cor da mensagem da aplicacao.")
  public String getCor() {
    return cor;
  }
  public void setCor(String cor) {
    this.cor = cor;
  }

  
  /**
   * Apresenta o som da mensagem da aplicacao
   **/
  @ApiModelProperty(value = "Apresenta o som da mensagem da aplicacao")
  public String getSom() {
    return som;
  }
  public void setSom(String som) {
    this.som = som;
  }

  
  /**
   * Apresenta o icone da mensagem da aplica\u00C3\u00A7\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "Apresenta o icone da mensagem da aplica\u00C3\u00A7\u00C3\u00A3o.")
  public String getIcone() {
    return icone;
  }
  public void setIcone(String icone) {
    this.icone = icone;
  }

  
  /**
   * Apresenta o certificado da aplica\u00C3\u00A7\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "Apresenta o certificado da aplica\u00C3\u00A7\u00C3\u00A3o.")
  public String getCertificadoBase64() {
    return certificadoBase64;
  }
  public void setCertificadoBase64(String certificadoBase64) {
    this.certificadoBase64 = certificadoBase64;
  }

  
  /**
   * Apresenta a senha da aplica\u00C3\u00A7\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "Apresenta a senha da aplica\u00C3\u00A7\u00C3\u00A3o.")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AplicacaoMobileResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
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


