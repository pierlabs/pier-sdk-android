package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.TelefonePessoaAprovadaPersist;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de persist\u00EAncia do s\u00F3cio da pessoa aprovada
 **/
@ApiModel(description = "Objeto de persist\u00EAncia do s\u00F3cio da pessoa aprovada")
public class SocioAprovadoPersist  {
  
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("cpf")
  private String cpf = null;
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
  @SerializedName("estadoCivil")
  private String estadoCivil = null;
  @SerializedName("profissao")
  private String profissao = null;
  @SerializedName("nacionalidade")
  private String nacionalidade = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("flagDeficienteVisual")
  private Boolean flagDeficienteVisual = null;
  @SerializedName("telefones")
  private List<TelefonePessoaAprovadaPersist> telefones = null;

  
  /**
   * Nome do s\u00F3cio
   **/
  @ApiModelProperty(required = true, value = "Nome do s\u00F3cio")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * CPF do s\u00F3cio
   **/
  @ApiModelProperty(value = "CPF do s\u00F3cio")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * Data de Nascimento da Pessoa, quando PF, ou a Data de Abertura da Empresa, quando PJ. Essa data deve ser informada no formato aaaa-MM-dd
   **/
  @ApiModelProperty(required = true, value = "Data de Nascimento da Pessoa, quando PF, ou a Data de Abertura da Empresa, quando PJ. Essa data deve ser informada no formato aaaa-MM-dd")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * Sexo do s\u00F3cio
   **/
  @ApiModelProperty(value = "Sexo do s\u00F3cio")
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  
  /**
   * N\u00FAmero da Identidade
   **/
  @ApiModelProperty(value = "N\u00FAmero da Identidade")
  public String getNumeroIdentidade() {
    return numeroIdentidade;
  }
  public void setNumeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
  }

  
  /**
   * Org\u00E3o expedidor da Identidade
   **/
  @ApiModelProperty(value = "Org\u00E3o expedidor da Identidade")
  public String getOrgaoExpedidorIdentidade() {
    return orgaoExpedidorIdentidade;
  }
  public void setOrgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
    this.orgaoExpedidorIdentidade = orgaoExpedidorIdentidade;
  }

  
  /**
   * Sigla da Unidade Federativa de onde foi expedido a Identidade
   **/
  @ApiModelProperty(value = "Sigla da Unidade Federativa de onde foi expedido a Identidade")
  public String getUnidadeFederativaIdentidade() {
    return unidadeFederativaIdentidade;
  }
  public void setUnidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
    this.unidadeFederativaIdentidade = unidadeFederativaIdentidade;
  }

  
  /**
   * Data emiss\u00E3o da Identidade
   **/
  @ApiModelProperty(value = "Data emiss\u00E3o da Identidade")
  public String getDataEmissaoIdentidade() {
    return dataEmissaoIdentidade;
  }
  public void setDataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
  }

  
  /**
   * Estado civil do s\u00F3cio
   **/
  @ApiModelProperty(value = "Estado civil do s\u00F3cio")
  public String getEstadoCivil() {
    return estadoCivil;
  }
  public void setEstadoCivil(String estadoCivil) {
    this.estadoCivil = estadoCivil;
  }

  
  /**
   * Profiss\u00E3o do s\u00F3cio
   **/
  @ApiModelProperty(value = "Profiss\u00E3o do s\u00F3cio")
  public String getProfissao() {
    return profissao;
  }
  public void setProfissao(String profissao) {
    this.profissao = profissao;
  }

  
  /**
   * Nacionalidade do s\u00F3cio
   **/
  @ApiModelProperty(value = "Nacionalidade do s\u00F3cio")
  public String getNacionalidade() {
    return nacionalidade;
  }
  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

  
  /**
   * Email do s\u00F3cio
   **/
  @ApiModelProperty(value = "Email do s\u00F3cio")
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
   * Telefones do s\u00F3cio
   **/
  @ApiModelProperty(value = "Telefones do s\u00F3cio")
  public List<TelefonePessoaAprovadaPersist> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelefonePessoaAprovadaPersist> telefones) {
    this.telefones = telefones;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocioAprovadoPersist {\n");
    
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("  dataNascimento: ").append(dataNascimento).append("\n");
    sb.append("  sexo: ").append(sexo).append("\n");
    sb.append("  numeroIdentidade: ").append(numeroIdentidade).append("\n");
    sb.append("  orgaoExpedidorIdentidade: ").append(orgaoExpedidorIdentidade).append("\n");
    sb.append("  unidadeFederativaIdentidade: ").append(unidadeFederativaIdentidade).append("\n");
    sb.append("  dataEmissaoIdentidade: ").append(dataEmissaoIdentidade).append("\n");
    sb.append("  estadoCivil: ").append(estadoCivil).append("\n");
    sb.append("  profissao: ").append(profissao).append("\n");
    sb.append("  nacionalidade: ").append(nacionalidade).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  flagDeficienteVisual: ").append(flagDeficienteVisual).append("\n");
    sb.append("  telefones: ").append(telefones).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
