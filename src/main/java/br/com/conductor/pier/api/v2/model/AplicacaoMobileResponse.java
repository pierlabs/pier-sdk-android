package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{aplicacao_mobile_response_description}}}
 **/
@ApiModel(description = "{{{aplicacao_mobile_response_description}}}")
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
   * {{{aplicacao_mobile_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{aplicacao_mobile_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{aplicacao_mobile_response_id_plataforma_mobile_value}}}
   **/
  @ApiModelProperty(value = "{{{aplicacao_mobile_response_id_plataforma_mobile_value}}}")
  public Long getIdPlataformaMobile() {
    return idPlataformaMobile;
  }
  public void setIdPlataformaMobile(Long idPlataformaMobile) {
    this.idPlataformaMobile = idPlataformaMobile;
  }

  
  /**
   * {{{aplicacao_mobile_response_token_value}}}
   **/
  @ApiModelProperty(value = "{{{aplicacao_mobile_response_token_value}}}")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   * {{{aplicacao_mobile_response_cor_value}}}
   **/
  @ApiModelProperty(value = "{{{aplicacao_mobile_response_cor_value}}}")
  public String getCor() {
    return cor;
  }
  public void setCor(String cor) {
    this.cor = cor;
  }

  
  /**
   * {{{aplicacao_mobile_response_som_value}}}
   **/
  @ApiModelProperty(value = "{{{aplicacao_mobile_response_som_value}}}")
  public String getSom() {
    return som;
  }
  public void setSom(String som) {
    this.som = som;
  }

  
  /**
   * {{{aplicacao_mobile_response_icone_value}}}
   **/
  @ApiModelProperty(value = "{{{aplicacao_mobile_response_icone_value}}}")
  public String getIcone() {
    return icone;
  }
  public void setIcone(String icone) {
    this.icone = icone;
  }

  
  /**
   * {{{aplicacao_mobile_response_certificado_base64_value}}}
   **/
  @ApiModelProperty(value = "{{{aplicacao_mobile_response_certificado_base64_value}}}")
  public String getCertificadoBase64() {
    return certificadoBase64;
  }
  public void setCertificadoBase64(String certificadoBase64) {
    this.certificadoBase64 = certificadoBase64;
  }

  
  /**
   * {{{aplicacao_mobile_response_senha_value}}}
   **/
  @ApiModelProperty(value = "{{{aplicacao_mobile_response_senha_value}}}")
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


