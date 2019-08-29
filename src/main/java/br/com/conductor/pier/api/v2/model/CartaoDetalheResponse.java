package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Cart\u00E3o com mais informa\u00E7\u00F5es
 **/
@ApiModel(description = "Objeto Cart\u00E3o com mais informa\u00E7\u00F5es")
public class CartaoDetalheResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("flagTitular")
  private Integer flagTitular = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("sequencialCartao")
  private Integer sequencialCartao = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idStatus")
  private Long idStatus = null;
  @SerializedName("dataStatus")
  private String dataStatus = null;
  @SerializedName("idEstagio")
  private Long idEstagio = null;
  @SerializedName("dataEstagio")
  private String dataEstagio = null;
  @SerializedName("numeroBin")
  private Long numeroBin = null;
  @SerializedName("numeroCartao")
  private String numeroCartao = null;
  @SerializedName("numeroCartaoHash")
  private Long numeroCartaoHash = null;
  @SerializedName("numeroCartaoCriptografado")
  private String numeroCartaoCriptografado = null;
  @SerializedName("dataEmissao")
  private String dataEmissao = null;
  @SerializedName("dataValidade")
  private String dataValidade = null;
  @SerializedName("cartaoVirtual")
  private Integer cartaoVirtual = null;
  @SerializedName("impressaoAvulsa")
  private Integer impressaoAvulsa = null;
  @SerializedName("dataImpressao")
  private String dataImpressao = null;
  @SerializedName("nomeArquivoImpressao")
  private String nomeArquivoImpressao = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("nomeImpresso")
  private String nomeImpresso = null;
  @SerializedName("codigoDesbloqueio")
  private String codigoDesbloqueio = null;
  @SerializedName("portador")
  private Integer portador = null;
  @SerializedName("flagCartaoMifare")
  private Boolean flagCartaoMifare = null;
  @SerializedName("idImagem")
  private Long idImagem = null;
  @SerializedName("descricaoTipoCartao")
  private String descricaoTipoCartao = null;
  @SerializedName("tipoCartao")
  private Long tipoCartao = null;
  @SerializedName("idMifare")
  private Long idMifare = null;
  @SerializedName("matriculaMifare")
  private String matriculaMifare = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Apresenta o tipo do Portador do cart\u00E3o, sendo: (1: Titular, 0: Adicional)
   **/
  @ApiModelProperty(value = "Apresenta o tipo do Portador do cart\u00E3o, sendo: (1: Titular, 0: Adicional)")
  public Integer getFlagTitular() {
    return flagTitular;
  }
  public void setFlagTitular(Integer flagTitular) {
    this.flagTitular = flagTitular;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa a qual o cart\u00E3o pertence
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o da Pessoa a qual o cart\u00E3o pertence")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * N\u00FAmero sequencial do cart\u00E3o
   **/
  @ApiModelProperty(value = "N\u00FAmero sequencial do cart\u00E3o")
  public Integer getSequencialCartao() {
    return sequencialCartao;
  }
  public void setSequencialCartao(Integer sequencialCartao) {
    this.sequencialCartao = sequencialCartao;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Conta a qual o cart\u00E3o pertence
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o da Conta a qual o cart\u00E3o pertence")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Status do Cart\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do Status do Cart\u00E3o")
  public Long getIdStatus() {
    return idStatus;
  }
  public void setIdStatus(Long idStatus) {
    this.idStatus = idStatus;
  }

  
  /**
   * Apresenta a data em que o idStatusCartao atual do cart\u00E3o fora aplicado, quando houver
   **/
  @ApiModelProperty(value = "Apresenta a data em que o idStatusCartao atual do cart\u00E3o fora aplicado, quando houver")
  public String getDataStatus() {
    return dataStatus;
  }
  public void setDataStatus(String dataStatus) {
    this.dataStatus = dataStatus;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Est\u00E1gio de Impress\u00E3o do Cart\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do Est\u00E1gio de Impress\u00E3o do Cart\u00E3o")
  public Long getIdEstagio() {
    return idEstagio;
  }
  public void setIdEstagio(Long idEstagio) {
    this.idEstagio = idEstagio;
  }

  
  /**
   * Apresenta a data em que o idEstagio atual do cart\u00E3o fora aplicado, quando houver
   **/
  @ApiModelProperty(value = "Apresenta a data em que o idEstagio atual do cart\u00E3o fora aplicado, quando houver")
  public String getDataEstagio() {
    return dataEstagio;
  }
  public void setDataEstagio(String dataEstagio) {
    this.dataEstagio = dataEstagio;
  }

  
  /**
   * N\u00FAmero do bin do cart\u00E3o
   **/
  @ApiModelProperty(value = "N\u00FAmero do bin do cart\u00E3o")
  public Long getNumeroBin() {
    return numeroBin;
  }
  public void setNumeroBin(Long numeroBin) {
    this.numeroBin = numeroBin;
  }

  
  /**
   * Apresenta o n\u00FAmero do cart\u00E3o
   **/
  @ApiModelProperty(value = "Apresenta o n\u00FAmero do cart\u00E3o")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * N\u00FAmero do cart\u00E3o hash
   **/
  @ApiModelProperty(value = "N\u00FAmero do cart\u00E3o hash")
  public Long getNumeroCartaoHash() {
    return numeroCartaoHash;
  }
  public void setNumeroCartaoHash(Long numeroCartaoHash) {
    this.numeroCartaoHash = numeroCartaoHash;
  }

  
  /**
   * N\u00FAmero do cart\u00E3o criptografado
   **/
  @ApiModelProperty(value = "N\u00FAmero do cart\u00E3o criptografado")
  public String getNumeroCartaoCriptografado() {
    return numeroCartaoCriptografado;
  }
  public void setNumeroCartaoCriptografado(String numeroCartaoCriptografado) {
    this.numeroCartaoCriptografado = numeroCartaoCriptografado;
  }

  
  /**
   * Apresenta a data de emiss\u00E3o do cart\u00E3o
   **/
  @ApiModelProperty(value = "Apresenta a data de emiss\u00E3o do cart\u00E3o")
  public String getDataEmissao() {
    return dataEmissao;
  }
  public void setDataEmissao(String dataEmissao) {
    this.dataEmissao = dataEmissao;
  }

  
  /**
   * Apresenta a data de validade do cart\u00E3o em formato yyyy-MM, quando houver
   **/
  @ApiModelProperty(value = "Apresenta a data de validade do cart\u00E3o em formato yyyy-MM, quando houver")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * Apresenta o status que informa se o cart\u00E3o \u00E9 virtual. Sendo: (1: True, 0: False)
   **/
  @ApiModelProperty(value = "Apresenta o status que informa se o cart\u00E3o \u00E9 virtual. Sendo: (1: True, 0: False)")
  public Integer getCartaoVirtual() {
    return cartaoVirtual;
  }
  public void setCartaoVirtual(Integer cartaoVirtual) {
    this.cartaoVirtual = cartaoVirtual;
  }

  
  /**
   * Quando ativa, indica que o cart\u00E3o fora impresso na Origem Comercial
   **/
  @ApiModelProperty(value = "Quando ativa, indica que o cart\u00E3o fora impresso na Origem Comercial")
  public Integer getImpressaoAvulsa() {
    return impressaoAvulsa;
  }
  public void setImpressaoAvulsa(Integer impressaoAvulsa) {
    this.impressaoAvulsa = impressaoAvulsa;
  }

  
  /**
   * Apresenta a data em que o cart\u00E3o fora impresso, caso impress\u00E3o em loja, ou a data em que ele fora inclu\u00EDdo no arquivo para impress\u00E3o via gr\u00E1fica
   **/
  @ApiModelProperty(value = "Apresenta a data em que o cart\u00E3o fora impresso, caso impress\u00E3o em loja, ou a data em que ele fora inclu\u00EDdo no arquivo para impress\u00E3o via gr\u00E1fica")
  public String getDataImpressao() {
    return dataImpressao;
  }
  public void setDataImpressao(String dataImpressao) {
    this.dataImpressao = dataImpressao;
  }

  
  /**
   * Apresenta o nome do arquivo onde o cart\u00E3o fora inclu\u00EDdo para impress\u00E3o por uma gr\u00E1fica, quando houver
   **/
  @ApiModelProperty(value = "Apresenta o nome do arquivo onde o cart\u00E3o fora inclu\u00EDdo para impress\u00E3o por uma gr\u00E1fica, quando houver")
  public String getNomeArquivoImpressao() {
    return nomeArquivoImpressao;
  }
  public void setNomeArquivoImpressao(String nomeArquivoImpressao) {
    this.nomeArquivoImpressao = nomeArquivoImpressao;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Produto a qual o cart\u00E3o pertence
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do Produto a qual o cart\u00E3o pertence")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Apresenta o nome impresso no cart\u00E3o
   **/
  @ApiModelProperty(value = "Apresenta o nome impresso no cart\u00E3o")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * Apresenta um c\u00F3digo espec\u00EDfico para ser utilizado como vari\u00E1vel no processo de desbloqueio do cart\u00E3o para emissores que querem usar esta funcionalidade
   **/
  @ApiModelProperty(value = "Apresenta um c\u00F3digo espec\u00EDfico para ser utilizado como vari\u00E1vel no processo de desbloqueio do cart\u00E3o para emissores que querem usar esta funcionalidade")
  public String getCodigoDesbloqueio() {
    return codigoDesbloqueio;
  }
  public void setCodigoDesbloqueio(String codigoDesbloqueio) {
    this.codigoDesbloqueio = codigoDesbloqueio;
  }

  
  /**
   * Apresenta o n\u00FAmero do portador do cart\u00E3o
   **/
  @ApiModelProperty(value = "Apresenta o n\u00FAmero do portador do cart\u00E3o")
  public Integer getPortador() {
    return portador;
  }
  public void setPortador(Integer portador) {
    this.portador = portador;
  }

  
  /**
   * Identifica se o cart\u00E3o cont\u00E9m a tecnologia mifare
   **/
  @ApiModelProperty(value = "Identifica se o cart\u00E3o cont\u00E9m a tecnologia mifare")
  public Boolean getFlagCartaoMifare() {
    return flagCartaoMifare;
  }
  public void setFlagCartaoMifare(Boolean flagCartaoMifare) {
    this.flagCartaoMifare = flagCartaoMifare;
  }

  
  /**
   * Apresenta o identificador da cor do cart\u00E3o
   **/
  @ApiModelProperty(value = "Apresenta o identificador da cor do cart\u00E3o")
  public Long getIdImagem() {
    return idImagem;
  }
  public void setIdImagem(Long idImagem) {
    this.idImagem = idImagem;
  }

  
  /**
   * Descreve o tipo do cart\u00E3o
   **/
  @ApiModelProperty(value = "Descreve o tipo do cart\u00E3o")
  public String getDescricaoTipoCartao() {
    return descricaoTipoCartao;
  }
  public void setDescricaoTipoCartao(String descricaoTipoCartao) {
    this.descricaoTipoCartao = descricaoTipoCartao;
  }

  
  /**
   * Indica o identificador do tipo do cart\u00E3o
   **/
  @ApiModelProperty(value = "Indica o identificador do tipo do cart\u00E3o")
  public Long getTipoCartao() {
    return tipoCartao;
  }
  public void setTipoCartao(Long tipoCartao) {
    this.tipoCartao = tipoCartao;
  }

  
  /**
   * C\u00F3digo identificador da tecnologia MIFARE
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador da tecnologia MIFARE")
  public Long getIdMifare() {
    return idMifare;
  }
  public void setIdMifare(Long idMifare) {
    this.idMifare = idMifare;
  }

  
  /**
   * N\u00FAmero da matricula do portador
   **/
  @ApiModelProperty(value = "N\u00FAmero da matricula do portador")
  public String getMatriculaMifare() {
    return matriculaMifare;
  }
  public void setMatriculaMifare(String matriculaMifare) {
    this.matriculaMifare = matriculaMifare;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoDetalheResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  flagTitular: ").append(flagTitular).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  sequencialCartao: ").append(sequencialCartao).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idStatus: ").append(idStatus).append("\n");
    sb.append("  dataStatus: ").append(dataStatus).append("\n");
    sb.append("  idEstagio: ").append(idEstagio).append("\n");
    sb.append("  dataEstagio: ").append(dataEstagio).append("\n");
    sb.append("  numeroBin: ").append(numeroBin).append("\n");
    sb.append("  numeroCartao: ").append(numeroCartao).append("\n");
    sb.append("  numeroCartaoHash: ").append(numeroCartaoHash).append("\n");
    sb.append("  numeroCartaoCriptografado: ").append(numeroCartaoCriptografado).append("\n");
    sb.append("  dataEmissao: ").append(dataEmissao).append("\n");
    sb.append("  dataValidade: ").append(dataValidade).append("\n");
    sb.append("  cartaoVirtual: ").append(cartaoVirtual).append("\n");
    sb.append("  impressaoAvulsa: ").append(impressaoAvulsa).append("\n");
    sb.append("  dataImpressao: ").append(dataImpressao).append("\n");
    sb.append("  nomeArquivoImpressao: ").append(nomeArquivoImpressao).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  nomeImpresso: ").append(nomeImpresso).append("\n");
    sb.append("  codigoDesbloqueio: ").append(codigoDesbloqueio).append("\n");
    sb.append("  portador: ").append(portador).append("\n");
    sb.append("  flagCartaoMifare: ").append(flagCartaoMifare).append("\n");
    sb.append("  idImagem: ").append(idImagem).append("\n");
    sb.append("  descricaoTipoCartao: ").append(descricaoTipoCartao).append("\n");
    sb.append("  tipoCartao: ").append(tipoCartao).append("\n");
    sb.append("  idMifare: ").append(idMifare).append("\n");
    sb.append("  matriculaMifare: ").append(matriculaMifare).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
