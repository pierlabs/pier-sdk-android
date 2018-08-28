package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.TelefonePessoaAprovadaResponse;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{socio_aprovado_response_description}}}
 **/
@ApiModel(description = "{{{socio_aprovado_response_description}}}")
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
   * {{{socio_aprovado_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{socio_aprovado_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{socio_aprovado_response_nome_value}}}
   **/
  @ApiModelProperty(value = "{{{socio_aprovado_response_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{socio_aprovado_response_cpf_value}}}
   **/
  @ApiModelProperty(value = "{{{socio_aprovado_response_cpf_value}}}")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * {{{socio_aprovado_response_data_nascimento_value}}}
   **/
  @ApiModelProperty(value = "{{{socio_aprovado_response_data_nascimento_value}}}")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * {{{socio_aprovado_response_sexo_value}}}
   **/
  @ApiModelProperty(value = "{{{socio_aprovado_response_sexo_value}}}")
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  
  /**
   * {{{socio_aprovado_response_numero_identidade_value}}}
   **/
  @ApiModelProperty(value = "{{{socio_aprovado_response_numero_identidade_value}}}")
  public String getNumeroIdentidade() {
    return numeroIdentidade;
  }
  public void setNumeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
  }

  
  /**
   * {{{socio_aprovado_response_orgao_expedidor_identidade_value}}}
   **/
  @ApiModelProperty(value = "{{{socio_aprovado_response_orgao_expedidor_identidade_value}}}")
  public String getOrgaoExpedidorIdentidade() {
    return orgaoExpedidorIdentidade;
  }
  public void setOrgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
    this.orgaoExpedidorIdentidade = orgaoExpedidorIdentidade;
  }

  
  /**
   * {{{socio_aprovado_response_unidade_federativa_identidade_value}}}
   **/
  @ApiModelProperty(value = "{{{socio_aprovado_response_unidade_federativa_identidade_value}}}")
  public String getUnidadeFederativaIdentidade() {
    return unidadeFederativaIdentidade;
  }
  public void setUnidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
    this.unidadeFederativaIdentidade = unidadeFederativaIdentidade;
  }

  
  /**
   * {{{socio_aprovado_response_data_emissao_identidade_value}}}
   **/
  @ApiModelProperty(value = "{{{socio_aprovado_response_data_emissao_identidade_value}}}")
  public String getDataEmissaoIdentidade() {
    return dataEmissaoIdentidade;
  }
  public void setDataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
  }

  
  /**
   * {{{socio_aprovado_response_estado_civil_value}}}
   **/
  @ApiModelProperty(value = "{{{socio_aprovado_response_estado_civil_value}}}")
  public String getEstadoCivil() {
    return estadoCivil;
  }
  public void setEstadoCivil(String estadoCivil) {
    this.estadoCivil = estadoCivil;
  }

  
  /**
   * {{{socio_aprovado_response_profissao_value}}}
   **/
  @ApiModelProperty(value = "{{{socio_aprovado_response_profissao_value}}}")
  public String getProfissao() {
    return profissao;
  }
  public void setProfissao(String profissao) {
    this.profissao = profissao;
  }

  
  /**
   * {{{socio_aprovado_response_nacionalidade_value}}}
   **/
  @ApiModelProperty(value = "{{{socio_aprovado_response_nacionalidade_value}}}")
  public String getNacionalidade() {
    return nacionalidade;
  }
  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

  
  /**
   * {{{socio_aprovado_response_email_value}}}
   **/
  @ApiModelProperty(value = "{{{socio_aprovado_response_email_value}}}")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * {{{socio_aprovado_response_telefones_value}}}
   **/
  @ApiModelProperty(value = "{{{socio_aprovado_response_telefones_value}}}")
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
