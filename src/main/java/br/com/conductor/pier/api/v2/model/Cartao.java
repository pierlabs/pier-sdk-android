package br.com.conductor.pier.api.v2.model;

import java.util.Date;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Objeto Cart\u00C3\u00A3o
 **/
@ApiModel(description = "Objeto Cart\u00C3\u00A3o")
public class Cartao  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idStatusCartao")
  private Long idStatusCartao = null;
  @SerializedName("idEstagioCartao")
  private Long idEstagioCartao = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("tipoPortador")
  private String tipoPortador = null;
  @SerializedName("numeroCartao")
  private String numeroCartao = null;
  @SerializedName("nomeImpresso")
  private String nomeImpresso = null;
  @SerializedName("dataGeracao")
  private Date dataGeracao = null;
  @SerializedName("dataStatusCartao")
  private Date dataStatusCartao = null;
  @SerializedName("dataEstagioCartao")
  private Date dataEstagioCartao = null;
  @SerializedName("dataValidade")
  private Date dataValidade = null;
  @SerializedName("dataImpressao")
  private Date dataImpressao = null;
  @SerializedName("arquivoImpressao")
  private String arquivoImpressao = null;
  @SerializedName("flagImpressaoOrigemComercial")
  private Integer flagImpressaoOrigemComercial = null;
  @SerializedName("flagProvisorio")
  private Integer flagProvisorio = null;
  @SerializedName("codigoDesbloqueio")
  private String codigoDesbloqueio = null;

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id).")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status do Cart\u00C3\u00A3o (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status do Cart\u00C3\u00A3o (id).")
  public Long getIdStatusCartao() {
    return idStatusCartao;
  }
  public void setIdStatusCartao(Long idStatusCartao) {
    this.idStatusCartao = idStatusCartao;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Est\u00C3\u00A1gio de Impress\u00C3\u00A3o do Cart\u00C3\u00A3o (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Est\u00C3\u00A1gio de Impress\u00C3\u00A3o do Cart\u00C3\u00A3o (id).")
  public Long getIdEstagioCartao() {
    return idEstagioCartao;
  }
  public void setIdEstagioCartao(Long idEstagioCartao) {
    this.idEstagioCartao = idEstagioCartao;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Conta a qual o cart\u00C3\u00A3o pertence (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Conta a qual o cart\u00C3\u00A3o pertence (id).")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa a qual o cart\u00C3\u00A3o pertence (id)
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa a qual o cart\u00C3\u00A3o pertence (id)")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto a qual o cart\u00C3\u00A3o pertence (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto a qual o cart\u00C3\u00A3o pertence (id).")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Apresenta o tipo do Portador do cart\u00C3\u00A3o, sendo: ('T': Titular, 'A': Adicional).
   **/
  @ApiModelProperty(value = "Apresenta o tipo do Portador do cart\u00C3\u00A3o, sendo: ('T': Titular, 'A': Adicional).")
  public String getTipoPortador() {
    return tipoPortador;
  }
  public void setTipoPortador(String tipoPortador) {
    this.tipoPortador = tipoPortador;
  }

  
  /**
   * Apresenta o n\u00C3\u00BAmero do cart\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "Apresenta o n\u00C3\u00BAmero do cart\u00C3\u00A3o.")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * Apresenta o nome impresso no cart\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "Apresenta o nome impresso no cart\u00C3\u00A3o.")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * Apresenta a data em que o cart\u00C3\u00A3o foi gerado.
   **/
  @ApiModelProperty(value = "Apresenta a data em que o cart\u00C3\u00A3o foi gerado.")
  public Date getDataGeracao() {
    return dataGeracao;
  }
  public void setDataGeracao(Date dataGeracao) {
    this.dataGeracao = dataGeracao;
  }

  
  /**
   * Apresenta a data em que o idStatusCartao atual do cart\u00C3\u00A3o fora aplicado, quando houver.
   **/
  @ApiModelProperty(value = "Apresenta a data em que o idStatusCartao atual do cart\u00C3\u00A3o fora aplicado, quando houver.")
  public Date getDataStatusCartao() {
    return dataStatusCartao;
  }
  public void setDataStatusCartao(Date dataStatusCartao) {
    this.dataStatusCartao = dataStatusCartao;
  }

  
  /**
   * Apresenta a data em que o idEstagioCartao atual do cart\u00C3\u00A3o fora aplicado, quando houver.
   **/
  @ApiModelProperty(value = "Apresenta a data em que o idEstagioCartao atual do cart\u00C3\u00A3o fora aplicado, quando houver.")
  public Date getDataEstagioCartao() {
    return dataEstagioCartao;
  }
  public void setDataEstagioCartao(Date dataEstagioCartao) {
    this.dataEstagioCartao = dataEstagioCartao;
  }

  
  /**
   * Apresenta a data de validade do cart\u00C3\u00A3o em formato yyyy-MM, quando houver.
   **/
  @ApiModelProperty(value = "Apresenta a data de validade do cart\u00C3\u00A3o em formato yyyy-MM, quando houver.")
  public Date getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(Date dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * Apresenta a data em que o cart\u00C3\u00A3o fora impresso, caso impress\u00C3\u00A3o em loja, ou a data em que ele fora inclu\u00C3\u00ADdo no arquivo para impress\u00C3\u00A3o via gr\u00C3\u00A1fica.
   **/
  @ApiModelProperty(value = "Apresenta a data em que o cart\u00C3\u00A3o fora impresso, caso impress\u00C3\u00A3o em loja, ou a data em que ele fora inclu\u00C3\u00ADdo no arquivo para impress\u00C3\u00A3o via gr\u00C3\u00A1fica.")
  public Date getDataImpressao() {
    return dataImpressao;
  }
  public void setDataImpressao(Date dataImpressao) {
    this.dataImpressao = dataImpressao;
  }

  
  /**
   * Apresenta o nome do arquivo onde o cart\u00C3\u00A3o fora inclu\u00C3\u00ADdo para impress\u00C3\u00A3o por uma gr\u00C3\u00A1fica, quando houver.
   **/
  @ApiModelProperty(value = "Apresenta o nome do arquivo onde o cart\u00C3\u00A3o fora inclu\u00C3\u00ADdo para impress\u00C3\u00A3o por uma gr\u00C3\u00A1fica, quando houver.")
  public String getArquivoImpressao() {
    return arquivoImpressao;
  }
  public void setArquivoImpressao(String arquivoImpressao) {
    this.arquivoImpressao = arquivoImpressao;
  }

  
  /**
   * Quando ativa, indica que o cart\u00C3\u00A3o fora impresso na Origem Comercial.
   **/
  @ApiModelProperty(value = "Quando ativa, indica que o cart\u00C3\u00A3o fora impresso na Origem Comercial.")
  public Integer getFlagImpressaoOrigemComercial() {
    return flagImpressaoOrigemComercial;
  }
  public void setFlagImpressaoOrigemComercial(Integer flagImpressaoOrigemComercial) {
    this.flagImpressaoOrigemComercial = flagImpressaoOrigemComercial;
  }

  
  /**
   * Quando ativa, indica que o cart\u00C3\u00A3o \u00C3\u00A9 provis\u00C3\u00B3rio. Ou seja, \u00C3\u00A9 um cart\u00C3\u00A3o para uso tempor\u00C3\u00A1rio quando se deseja permitir que o cliente transacione sem que ele tenha recebido um cart\u00C3\u00A3o definitivo.
   **/
  @ApiModelProperty(value = "Quando ativa, indica que o cart\u00C3\u00A3o \u00C3\u00A9 provis\u00C3\u00B3rio. Ou seja, \u00C3\u00A9 um cart\u00C3\u00A3o para uso tempor\u00C3\u00A1rio quando se deseja permitir que o cliente transacione sem que ele tenha recebido um cart\u00C3\u00A3o definitivo.")
  public Integer getFlagProvisorio() {
    return flagProvisorio;
  }
  public void setFlagProvisorio(Integer flagProvisorio) {
    this.flagProvisorio = flagProvisorio;
  }

  
  /**
   * Apresenta um c\u00C3\u00B3digo espec\u00C3\u00ADfico para ser utilizado como vari\u00C3\u00A1vel no processo de desbloqueio do cart\u00C3\u00A3o para emissores que querem usar esta funcionalidade.
   **/
  @ApiModelProperty(value = "Apresenta um c\u00C3\u00B3digo espec\u00C3\u00ADfico para ser utilizado como vari\u00C3\u00A1vel no processo de desbloqueio do cart\u00C3\u00A3o para emissores que querem usar esta funcionalidade.")
  public String getCodigoDesbloqueio() {
    return codigoDesbloqueio;
  }
  public void setCodigoDesbloqueio(String codigoDesbloqueio) {
    this.codigoDesbloqueio = codigoDesbloqueio;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cartao {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idStatusCartao: ").append(idStatusCartao).append("\n");
    sb.append("  idEstagioCartao: ").append(idEstagioCartao).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  tipoPortador: ").append(tipoPortador).append("\n");
    sb.append("  numeroCartao: ").append(numeroCartao).append("\n");
    sb.append("  nomeImpresso: ").append(nomeImpresso).append("\n");
    sb.append("  dataGeracao: ").append(dataGeracao).append("\n");
    sb.append("  dataStatusCartao: ").append(dataStatusCartao).append("\n");
    sb.append("  dataEstagioCartao: ").append(dataEstagioCartao).append("\n");
    sb.append("  dataValidade: ").append(dataValidade).append("\n");
    sb.append("  dataImpressao: ").append(dataImpressao).append("\n");
    sb.append("  arquivoImpressao: ").append(arquivoImpressao).append("\n");
    sb.append("  flagImpressaoOrigemComercial: ").append(flagImpressaoOrigemComercial).append("\n");
    sb.append("  flagProvisorio: ").append(flagProvisorio).append("\n");
    sb.append("  codigoDesbloqueio: ").append(codigoDesbloqueio).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


