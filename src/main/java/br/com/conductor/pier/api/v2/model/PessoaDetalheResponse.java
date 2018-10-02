package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{pessoa_detalhe_response_description}}}
 **/
@ApiModel(description = "{{{pessoa_detalhe_response_description}}}")
public class PessoaDetalheResponse  {
  
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("nomeMae")
  private String nomeMae = null;
  @SerializedName("idEstadoCivil")
  private Long idEstadoCivil = null;
  @SerializedName("idProfissao")
  private String idProfissao = null;
  @SerializedName("idNaturezaOcupacao")
  private Long idNaturezaOcupacao = null;
  @SerializedName("idNacionalidade")
  private Long idNacionalidade = null;
  @SerializedName("numeroBanco")
  private Integer numeroBanco = null;
  @SerializedName("numeroAgencia")
  private Integer numeroAgencia = null;
  @SerializedName("numeroContaCorrente")
  private String numeroContaCorrente = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("nomeEmpresa")
  private String nomeEmpresa = null;
  @SerializedName("nomeReferencia1")
  private String nomeReferencia1 = null;
  @SerializedName("salario")
  private BigDecimal salario = null;
  @SerializedName("enderecoReferencia1")
  private String enderecoReferencia1 = null;
  @SerializedName("nomeReferencia2")
  private String nomeReferencia2 = null;
  @SerializedName("enderecoReferencia2")
  private String enderecoReferencia2 = null;

  
  /**
   * {{{pessoa_detalhe_response_id_pessoa_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_detalhe_response_id_pessoa_value}}}")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * {{{pessoa_detalhe_response_nome_mae_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_detalhe_response_nome_mae_value}}}")
  public String getNomeMae() {
    return nomeMae;
  }
  public void setNomeMae(String nomeMae) {
    this.nomeMae = nomeMae;
  }

  
  /**
   * {{{pessoa_detalhe_response_id_estado_civil_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_detalhe_response_id_estado_civil_value}}}")
  public Long getIdEstadoCivil() {
    return idEstadoCivil;
  }
  public void setIdEstadoCivil(Long idEstadoCivil) {
    this.idEstadoCivil = idEstadoCivil;
  }

  
  /**
   * {{{pessoa_detalhe_response_id_profissao_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_detalhe_response_id_profissao_value}}}")
  public String getIdProfissao() {
    return idProfissao;
  }
  public void setIdProfissao(String idProfissao) {
    this.idProfissao = idProfissao;
  }

  
  /**
   * {{{pessoa_detalhe_response_id_natureza_ocupacao_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_detalhe_response_id_natureza_ocupacao_value}}}")
  public Long getIdNaturezaOcupacao() {
    return idNaturezaOcupacao;
  }
  public void setIdNaturezaOcupacao(Long idNaturezaOcupacao) {
    this.idNaturezaOcupacao = idNaturezaOcupacao;
  }

  
  /**
   * {{{pessoa_detalhe_response_id_nacionalidade_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_detalhe_response_id_nacionalidade_value}}}")
  public Long getIdNacionalidade() {
    return idNacionalidade;
  }
  public void setIdNacionalidade(Long idNacionalidade) {
    this.idNacionalidade = idNacionalidade;
  }

  
  /**
   * {{{pessoa_detalhe_response_numero_banco_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_detalhe_response_numero_banco_value}}}")
  public Integer getNumeroBanco() {
    return numeroBanco;
  }
  public void setNumeroBanco(Integer numeroBanco) {
    this.numeroBanco = numeroBanco;
  }

  
  /**
   * {{{pessoa_detalhe_response_numero_agencia_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_detalhe_response_numero_agencia_value}}}")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * {{{pessoa_detalhe_response_numero_conta_corrente_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_detalhe_response_numero_conta_corrente_value}}}")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * {{{pessoa_detalhe_response_email_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_detalhe_response_email_value}}}")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * {{{pessoa_detalhe_response_nome_empresa_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_detalhe_response_nome_empresa_value}}}")
  public String getNomeEmpresa() {
    return nomeEmpresa;
  }
  public void setNomeEmpresa(String nomeEmpresa) {
    this.nomeEmpresa = nomeEmpresa;
  }

  
  /**
   * {{{pessoa_detalhe_response_nome_referencia_1_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_detalhe_response_nome_referencia_1_value}}}")
  public String getNomeReferencia1() {
    return nomeReferencia1;
  }
  public void setNomeReferencia1(String nomeReferencia1) {
    this.nomeReferencia1 = nomeReferencia1;
  }

  
  /**
   * {{{pessoa_detalhe_response_salario_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_detalhe_response_salario_value}}}")
  public BigDecimal getSalario() {
    return salario;
  }
  public void setSalario(BigDecimal salario) {
    this.salario = salario;
  }

  
  /**
   * {{{pessoa_detalhe_response_endereco_referencia_1_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_detalhe_response_endereco_referencia_1_value}}}")
  public String getEnderecoReferencia1() {
    return enderecoReferencia1;
  }
  public void setEnderecoReferencia1(String enderecoReferencia1) {
    this.enderecoReferencia1 = enderecoReferencia1;
  }

  
  /**
   * {{{pessoa_detalhe_response_nome_referencia_2_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_detalhe_response_nome_referencia_2_value}}}")
  public String getNomeReferencia2() {
    return nomeReferencia2;
  }
  public void setNomeReferencia2(String nomeReferencia2) {
    this.nomeReferencia2 = nomeReferencia2;
  }

  
  /**
   * {{{pessoa_detalhe_response_endereco_referencia_2_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_detalhe_response_endereco_referencia_2_value}}}")
  public String getEnderecoReferencia2() {
    return enderecoReferencia2;
  }
  public void setEnderecoReferencia2(String enderecoReferencia2) {
    this.enderecoReferencia2 = enderecoReferencia2;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PessoaDetalheResponse {\n");
    
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  nomeMae: ").append(nomeMae).append("\n");
    sb.append("  idEstadoCivil: ").append(idEstadoCivil).append("\n");
    sb.append("  idProfissao: ").append(idProfissao).append("\n");
    sb.append("  idNaturezaOcupacao: ").append(idNaturezaOcupacao).append("\n");
    sb.append("  idNacionalidade: ").append(idNacionalidade).append("\n");
    sb.append("  numeroBanco: ").append(numeroBanco).append("\n");
    sb.append("  numeroAgencia: ").append(numeroAgencia).append("\n");
    sb.append("  numeroContaCorrente: ").append(numeroContaCorrente).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  nomeEmpresa: ").append(nomeEmpresa).append("\n");
    sb.append("  nomeReferencia1: ").append(nomeReferencia1).append("\n");
    sb.append("  salario: ").append(salario).append("\n");
    sb.append("  enderecoReferencia1: ").append(enderecoReferencia1).append("\n");
    sb.append("  nomeReferencia2: ").append(nomeReferencia2).append("\n");
    sb.append("  enderecoReferencia2: ").append(enderecoReferencia2).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
