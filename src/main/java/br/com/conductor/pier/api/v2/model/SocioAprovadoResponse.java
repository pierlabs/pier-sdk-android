package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.TelefonePessoaAprovadaResponse;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * PessoaPersist
 **/
@ApiModel(description = "PessoaPersist")
public class SocioAprovadoResponse  {
  
  @SerializedName("id")
  private Long id = null;
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
  @SerializedName("telefones")
  private List<TelefonePessoaAprovadaResponse> telefones = null;

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do S\u00C3\u00B3cio (id)
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do S\u00C3\u00B3cio (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Apresenta o Nome do Socio
   **/
  @ApiModelProperty(value = "Apresenta o Nome do Socio")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * N\u00C3\u00BAmero do CPF, quando PF.
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero do CPF, quando PF.")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * Data de Nascimento da Pessoa, quando PF, ou a Data de Abertura da Empresa, quando PJ. Essa data deve ser informada no formato aaaa-MM-dd.
   **/
  @ApiModelProperty(value = "Data de Nascimento da Pessoa, quando PF, ou a Data de Abertura da Empresa, quando PJ. Essa data deve ser informada no formato aaaa-MM-dd.")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do sexo da Pessoa, quando PF, sendo: (\"M\": Masculino), (\"F\": Feminino), (\"O\": Outro), (\"N\": N\u00C3\u00A3o Especificado).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do sexo da Pessoa, quando PF, sendo: (\"M\": Masculino), (\"F\": Feminino), (\"O\": Outro), (\"N\": N\u00C3\u00A3o Especificado).")
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  
  /**
   * N\u00C3\u00BAmero da Identidade.
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero da Identidade.")
  public String getNumeroIdentidade() {
    return numeroIdentidade;
  }
  public void setNumeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
  }

  
  /**
   * Org\u00C3\u00A3o expedidor do RG.
   **/
  @ApiModelProperty(value = "Org\u00C3\u00A3o expedidor do RG.")
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
   * Data emiss\u00C3\u00A3o da Identidade
   **/
  @ApiModelProperty(value = "Data emiss\u00C3\u00A3o da Identidade")
  public String getDataEmissaoIdentidade() {
    return dataEmissaoIdentidade;
  }
  public void setDataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
  }

  
  /**
   * Estado civil do s\u00C3\u00B3cio
   **/
  @ApiModelProperty(value = "Estado civil do s\u00C3\u00B3cio")
  public String getEstadoCivil() {
    return estadoCivil;
  }
  public void setEstadoCivil(String estadoCivil) {
    this.estadoCivil = estadoCivil;
  }

  
  /**
   * Profiss\u00C3\u00A3o do s\u00C3\u00B3cio
   **/
  @ApiModelProperty(value = "Profiss\u00C3\u00A3o do s\u00C3\u00B3cio")
  public String getProfissao() {
    return profissao;
  }
  public void setProfissao(String profissao) {
    this.profissao = profissao;
  }

  
  /**
   * Nacionalidade do s\u00C3\u00B3cio
   **/
  @ApiModelProperty(value = "Nacionalidade do s\u00C3\u00B3cio")
  public String getNacionalidade() {
    return nacionalidade;
  }
  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

  
  /**
   * Email do s\u00C3\u00B3cio
   **/
  @ApiModelProperty(value = "Email do s\u00C3\u00B3cio")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Informa os telefones do s\u00C3\u00B3cio
   **/
  @ApiModelProperty(value = "Informa os telefones do s\u00C3\u00B3cio")
  public List<TelefonePessoaAprovadaResponse> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelefonePessoaAprovadaResponse> telefones) {
    this.telefones = telefones;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocioAprovadoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
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
    sb.append("  telefones: ").append(telefones).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


