package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.TelefoneAdicionalPersist;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da entrada do recurso de cadastrar adicionais
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da entrada do recurso de cadastrar adicionais")
public class AdicionalPersist  {
  
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("nomeImpresso")
  private String nomeImpresso = null;
  @SerializedName("numeroReceitaFederal")
  private String numeroReceitaFederal = null;
  @SerializedName("dataNascimento")
  private String dataNascimento = null;
  @SerializedName("sexo")
  private String sexo = null;
  @SerializedName("numeroIdentidade")
  private String numeroIdentidade = null;
  @SerializedName("orgaoExpedidorIdentidade")
  private String orgaoExpedidorIdentidade = null;
  @SerializedName("unidadeFederativaIdentidade")
  private String unidadeFederativaIdentidade = null;
  @SerializedName("dataEmissaoIdentidade")
  private String dataEmissaoIdentidade = null;
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
  @SerializedName("flagDeficienteVisual")
  private Boolean flagDeficienteVisual = null;
  @SerializedName("telefones")
  private List<TelefoneAdicionalPersist> telefones = null;

  
  /**
   * Nome completo do Adicional
   **/
  @ApiModelProperty(required = true, value = "Nome completo do Adicional")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Nome do Adicional que ser\u00E1 gravado no Cart\u00E3o
   **/
  @ApiModelProperty(value = "Nome do Adicional que ser\u00E1 gravado no Cart\u00E3o")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * N\u00FAmero da Receita Federal
   **/
  @ApiModelProperty(required = true, value = "N\u00FAmero da Receita Federal")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * Data de Nascimento do Adicional em formato yyyy-MM-dd
   **/
  @ApiModelProperty(value = "Data de Nascimento do Adicional em formato yyyy-MM-dd")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * Sexo do Adicional
   **/
  @ApiModelProperty(value = "Sexo do Adicional")
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  
  /**
   * N\u00FAmero do Documento de Identidade do Adicional
   **/
  @ApiModelProperty(value = "N\u00FAmero do Documento de Identidade do Adicional")
  public String getNumeroIdentidade() {
    return numeroIdentidade;
  }
  public void setNumeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
  }

  
  /**
   * Nome do Org\u00E3o Emissor do Documento de Identidade do Adicional
   **/
  @ApiModelProperty(value = "Nome do Org\u00E3o Emissor do Documento de Identidade do Adicional")
  public String getOrgaoExpedidorIdentidade() {
    return orgaoExpedidorIdentidade;
  }
  public void setOrgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
    this.orgaoExpedidorIdentidade = orgaoExpedidorIdentidade;
  }

  
  /**
   * Unidade Federativa
   **/
  @ApiModelProperty(value = "Unidade Federativa")
  public String getUnidadeFederativaIdentidade() {
    return unidadeFederativaIdentidade;
  }
  public void setUnidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
    this.unidadeFederativaIdentidade = unidadeFederativaIdentidade;
  }

  
  /**
   * Data de emiss\u00E3o do Documento de Identidade do Adicional em formato yyyy-MM-dd
   **/
  @ApiModelProperty(value = "Data de emiss\u00E3o do Documento de Identidade do Adicional em formato yyyy-MM-dd")
  public String getDataEmissaoIdentidade() {
    return dataEmissaoIdentidade;
  }
  public void setDataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do Estado Civil do Adicional
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do Estado Civil do Adicional")
  public Long getIdEstadoCivil() {
    return idEstadoCivil;
  }
  public void setIdEstadoCivil(Long idEstadoCivil) {
    this.idEstadoCivil = idEstadoCivil;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da Profissao do Adicional
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da Profissao do Adicional")
  public Long getIdProfissao() {
    return idProfissao;
  }
  public void setIdProfissao(Long idProfissao) {
    this.idProfissao = idProfissao;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da Nacionalidade do Adicional
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da Nacionalidade do Adicional")
  public Long getIdNacionalidade() {
    return idNacionalidade;
  }
  public void setIdNacionalidade(Long idNacionalidade) {
    this.idNacionalidade = idNacionalidade;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do Parentesco do Adicional com o Titular
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do Parentesco do Adicional com o Titular")
  public Long getIdParentesco() {
    return idParentesco;
  }
  public void setIdParentesco(Long idParentesco) {
    this.idParentesco = idParentesco;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do Parentesco do Adicional com o Titular
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do Parentesco do Adicional com o Titular")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Flag que identifica uma pessoa como deficiente visual
   **/
  @ApiModelProperty(value = "Flag que identifica uma pessoa como deficiente visual")
  public Boolean getFlagDeficienteVisual() {
    return flagDeficienteVisual;
  }
  public void setFlagDeficienteVisual(Boolean flagDeficienteVisual) {
    this.flagDeficienteVisual = flagDeficienteVisual;
  }

  
  /**
   * Lista de telefones do adicional
   **/
  @ApiModelProperty(value = "Lista de telefones do adicional")
  public List<TelefoneAdicionalPersist> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelefoneAdicionalPersist> telefones) {
    this.telefones = telefones;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdicionalPersist {\n");
    
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  nomeImpresso: ").append(nomeImpresso).append("\n");
    sb.append("  numeroReceitaFederal: ").append(numeroReceitaFederal).append("\n");
    sb.append("  dataNascimento: ").append(dataNascimento).append("\n");
    sb.append("  sexo: ").append(sexo).append("\n");
    sb.append("  numeroIdentidade: ").append(numeroIdentidade).append("\n");
    sb.append("  orgaoExpedidorIdentidade: ").append(orgaoExpedidorIdentidade).append("\n");
    sb.append("  unidadeFederativaIdentidade: ").append(unidadeFederativaIdentidade).append("\n");
    sb.append("  dataEmissaoIdentidade: ").append(dataEmissaoIdentidade).append("\n");
    sb.append("  idEstadoCivil: ").append(idEstadoCivil).append("\n");
    sb.append("  idProfissao: ").append(idProfissao).append("\n");
    sb.append("  idNacionalidade: ").append(idNacionalidade).append("\n");
    sb.append("  idParentesco: ").append(idParentesco).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  flagDeficienteVisual: ").append(flagDeficienteVisual).append("\n");
    sb.append("  telefones: ").append(telefones).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
