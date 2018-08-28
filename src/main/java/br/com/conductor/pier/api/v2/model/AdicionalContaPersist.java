package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{adicional_conta_persist_description}}}
 **/
@ApiModel(description = "{{{adicional_conta_persist_description}}}")
public class AdicionalContaPersist  {
  
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("nomeImpresso")
  private String nomeImpresso = null;
  @SerializedName("idEstadoCivil")
  private Long idEstadoCivil = null;
  @SerializedName("idProfissao")
  private Long idProfissao = null;
  @SerializedName("idNacionalidade")
  private Long idNacionalidade = null;
  @SerializedName("idParentesco")
  private Long idParentesco = null;
  @SerializedName("email")
  private String email = null;

  
  /**
   * {{{adicional_conta_persist_id_pessoa_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{adicional_conta_persist_id_pessoa_value}}}")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * {{{adicional_conta_persist_nome_impresso_value}}}
   **/
  @ApiModelProperty(value = "{{{adicional_conta_persist_nome_impresso_value}}}")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * {{{adicional_conta_persist_id_estado_civil_value}}}
   **/
  @ApiModelProperty(value = "{{{adicional_conta_persist_id_estado_civil_value}}}")
  public Long getIdEstadoCivil() {
    return idEstadoCivil;
  }
  public void setIdEstadoCivil(Long idEstadoCivil) {
    this.idEstadoCivil = idEstadoCivil;
  }

  
  /**
   * {{{adicional_conta_persist_id_profissao_value}}}
   **/
  @ApiModelProperty(value = "{{{adicional_conta_persist_id_profissao_value}}}")
  public Long getIdProfissao() {
    return idProfissao;
  }
  public void setIdProfissao(Long idProfissao) {
    this.idProfissao = idProfissao;
  }

  
  /**
   * {{{adicional_conta_persist_id_nacionalidade_value}}}
   **/
  @ApiModelProperty(value = "{{{adicional_conta_persist_id_nacionalidade_value}}}")
  public Long getIdNacionalidade() {
    return idNacionalidade;
  }
  public void setIdNacionalidade(Long idNacionalidade) {
    this.idNacionalidade = idNacionalidade;
  }

  
  /**
   * {{{adicional_conta_persist_id_parentesco_value}}}
   **/
  @ApiModelProperty(value = "{{{adicional_conta_persist_id_parentesco_value}}}")
  public Long getIdParentesco() {
    return idParentesco;
  }
  public void setIdParentesco(Long idParentesco) {
    this.idParentesco = idParentesco;
  }

  
  /**
   * {{{adicional_conta_persist_email_value}}}
   **/
  @ApiModelProperty(value = "{{{adicional_conta_persist_email_value}}}")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdicionalContaPersist {\n");
    
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  nomeImpresso: ").append(nomeImpresso).append("\n");
    sb.append("  idEstadoCivil: ").append(idEstadoCivil).append("\n");
    sb.append("  idProfissao: ").append(idProfissao).append("\n");
    sb.append("  idNacionalidade: ").append(idNacionalidade).append("\n");
    sb.append("  idParentesco: ").append(idParentesco).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
