package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto que representa o response das transa\u00E7\u00F5es negadas
 **/
@ApiModel(description = "Objeto que representa o response das transa\u00E7\u00F5es negadas")
public class TransacaoNegadaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("numeroCartao")
  private String numeroCartao = null;
  @SerializedName("codigoProcessamento")
  private String codigoProcessamento = null;
  @SerializedName("codigoProcessamentoDescricao")
  private String codigoProcessamentoDescricao = null;
  @SerializedName("valor")
  private BigDecimal valor = null;
  @SerializedName("parcelas")
  private Integer parcelas = null;
  @SerializedName("nomeEstabelecimento")
  private String nomeEstabelecimento = null;
  @SerializedName("dataHoraEntrada")
  private String dataHoraEntrada = null;
  @SerializedName("dataHoraSaida")
  private String dataHoraSaida = null;
  @SerializedName("codigoResposta")
  private String codigoResposta = null;
  @SerializedName("respostaAutorizador")
  private String respostaAutorizador = null;
  @SerializedName("idDescricao")
  private Long idDescricao = null;
  @SerializedName("descricaoAplicativo")
  private String descricaoAplicativo = null;
  @SerializedName("descricaoTerminal")
  private String descricaoTerminal = null;
  @SerializedName("moedaEstrangeira")
  private String moedaEstrangeira = null;
  @SerializedName("valorCompraMoedaEstrangeira")
  private BigDecimal valorCompraMoedaEstrangeira = null;
  @SerializedName("cotacaoDolar")
  private BigDecimal cotacaoDolar = null;

  
  /**
   * C\u00F3digo identificador da mensagem
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador da mensagem")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo identificador do produto
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do produto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * C\u00F3digo identificador do cart\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do cart\u00E3o")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * N\u00FAmero do cart\u00E3o mascarado
   **/
  @ApiModelProperty(value = "N\u00FAmero do cart\u00E3o mascarado")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * C\u00F3digo de processamento
   **/
  @ApiModelProperty(value = "C\u00F3digo de processamento")
  public String getCodigoProcessamento() {
    return codigoProcessamento;
  }
  public void setCodigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
  }

  
  /**
   * Descri\u00E7\u00E3o do c\u00F3digo de processamento
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do c\u00F3digo de processamento")
  public String getCodigoProcessamentoDescricao() {
    return codigoProcessamentoDescricao;
  }
  public void setCodigoProcessamentoDescricao(String codigoProcessamentoDescricao) {
    this.codigoProcessamentoDescricao = codigoProcessamentoDescricao;
  }

  
  /**
   * Valor da transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Valor da transa\u00E7\u00E3o")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Quantidade de parcelas para parcelamento
   **/
  @ApiModelProperty(value = "Quantidade de parcelas para parcelamento")
  public Integer getParcelas() {
    return parcelas;
  }
  public void setParcelas(Integer parcelas) {
    this.parcelas = parcelas;
  }

  
  /**
   * Nome do estabelecimento onde ocorreu a transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Nome do estabelecimento onde ocorreu a transa\u00E7\u00E3o")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   * Data e hora em que a transa\u00E7\u00E3o entrou no autorizador
   **/
  @ApiModelProperty(value = "Data e hora em que a transa\u00E7\u00E3o entrou no autorizador")
  public String getDataHoraEntrada() {
    return dataHoraEntrada;
  }
  public void setDataHoraEntrada(String dataHoraEntrada) {
    this.dataHoraEntrada = dataHoraEntrada;
  }

  
  /**
   * Data e hora em que a transa\u00E7\u00E3o saiu do autorizador
   **/
  @ApiModelProperty(value = "Data e hora em que a transa\u00E7\u00E3o saiu do autorizador")
  public String getDataHoraSaida() {
    return dataHoraSaida;
  }
  public void setDataHoraSaida(String dataHoraSaida) {
    this.dataHoraSaida = dataHoraSaida;
  }

  
  /**
   * C\u00F3digo da mensagem de resposta
   **/
  @ApiModelProperty(value = "C\u00F3digo da mensagem de resposta")
  public String getCodigoResposta() {
    return codigoResposta;
  }
  public void setCodigoResposta(String codigoResposta) {
    this.codigoResposta = codigoResposta;
  }

  
  /**
   * Mensagem de resposta do autorizador
   **/
  @ApiModelProperty(value = "Mensagem de resposta do autorizador")
  public String getRespostaAutorizador() {
    return respostaAutorizador;
  }
  public void setRespostaAutorizador(String respostaAutorizador) {
    this.respostaAutorizador = respostaAutorizador;
  }

  
  /**
   * C\u00F3digo da mensagem de transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo da mensagem de transa\u00E7\u00E3o")
  public Long getIdDescricao() {
    return idDescricao;
  }
  public void setIdDescricao(Long idDescricao) {
    this.idDescricao = idDescricao;
  }

  
  /**
   * Mensagem de transa\u00E7\u00E3o do Aplicativo
   **/
  @ApiModelProperty(value = "Mensagem de transa\u00E7\u00E3o do Aplicativo")
  public String getDescricaoAplicativo() {
    return descricaoAplicativo;
  }
  public void setDescricaoAplicativo(String descricaoAplicativo) {
    this.descricaoAplicativo = descricaoAplicativo;
  }

  
  /**
   * Mensagem de transa\u00E7\u00E3o do Terminal
   **/
  @ApiModelProperty(value = "Mensagem de transa\u00E7\u00E3o do Terminal")
  public String getDescricaoTerminal() {
    return descricaoTerminal;
  }
  public void setDescricaoTerminal(String descricaoTerminal) {
    this.descricaoTerminal = descricaoTerminal;
  }

  
  /**
   * S\u00EDmbolo da moeda estrangeira
   **/
  @ApiModelProperty(value = "S\u00EDmbolo da moeda estrangeira")
  public String getMoedaEstrangeira() {
    return moedaEstrangeira;
  }
  public void setMoedaEstrangeira(String moedaEstrangeira) {
    this.moedaEstrangeira = moedaEstrangeira;
  }

  
  /**
   * Valor da transa\u00E7\u00E3o em moeda estrangeira
   **/
  @ApiModelProperty(value = "Valor da transa\u00E7\u00E3o em moeda estrangeira")
  public BigDecimal getValorCompraMoedaEstrangeira() {
    return valorCompraMoedaEstrangeira;
  }
  public void setValorCompraMoedaEstrangeira(BigDecimal valorCompraMoedaEstrangeira) {
    this.valorCompraMoedaEstrangeira = valorCompraMoedaEstrangeira;
  }

  
  /**
   * Valor da cota\u00E7\u00E3o do d\u00F3lar no dia da transa\u00E7ao
   **/
  @ApiModelProperty(value = "Valor da cota\u00E7\u00E3o do d\u00F3lar no dia da transa\u00E7ao")
  public BigDecimal getCotacaoDolar() {
    return cotacaoDolar;
  }
  public void setCotacaoDolar(BigDecimal cotacaoDolar) {
    this.cotacaoDolar = cotacaoDolar;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransacaoNegadaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  numeroCartao: ").append(numeroCartao).append("\n");
    sb.append("  codigoProcessamento: ").append(codigoProcessamento).append("\n");
    sb.append("  codigoProcessamentoDescricao: ").append(codigoProcessamentoDescricao).append("\n");
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("  parcelas: ").append(parcelas).append("\n");
    sb.append("  nomeEstabelecimento: ").append(nomeEstabelecimento).append("\n");
    sb.append("  dataHoraEntrada: ").append(dataHoraEntrada).append("\n");
    sb.append("  dataHoraSaida: ").append(dataHoraSaida).append("\n");
    sb.append("  codigoResposta: ").append(codigoResposta).append("\n");
    sb.append("  respostaAutorizador: ").append(respostaAutorizador).append("\n");
    sb.append("  idDescricao: ").append(idDescricao).append("\n");
    sb.append("  descricaoAplicativo: ").append(descricaoAplicativo).append("\n");
    sb.append("  descricaoTerminal: ").append(descricaoTerminal).append("\n");
    sb.append("  moedaEstrangeira: ").append(moedaEstrangeira).append("\n");
    sb.append("  valorCompraMoedaEstrangeira: ").append(valorCompraMoedaEstrangeira).append("\n");
    sb.append("  cotacaoDolar: ").append(cotacaoDolar).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
