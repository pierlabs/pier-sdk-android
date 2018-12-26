package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.TelefoneResponse;
import java.math.BigDecimal;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de resposta de Risco de Fraude Detalhado
 **/
@ApiModel(description = "Objeto de resposta de Risco de Fraude Detalhado")
public class RiscoFraudeDetalhadoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idTipoResolucao")
  private Long idTipoResolucao = null;
  @SerializedName("descricaoTipoResolucao")
  private String descricaoTipoResolucao = null;
  @SerializedName("flagAltoRisco")
  private Boolean flagAltoRisco = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("idTransacao")
  private Long idTransacao = null;
  @SerializedName("dataTransacao")
  private String dataTransacao = null;
  @SerializedName("valorTransacao")
  private BigDecimal valorTransacao = null;
  @SerializedName("codigoMoedaOrigem")
  private String codigoMoedaOrigem = null;
  @SerializedName("valorOrigem")
  private BigDecimal valorOrigem = null;
  @SerializedName("codigoMoedaDestino")
  private String codigoMoedaDestino = null;
  @SerializedName("valorDestino")
  private BigDecimal valorDestino = null;
  @SerializedName("nomeEstabelecimento")
  private String nomeEstabelecimento = null;
  @SerializedName("idPais")
  private String idPais = null;
  @SerializedName("codigoRespostaAutorizador")
  private String codigoRespostaAutorizador = null;
  @SerializedName("descricaoRespostaAutorizador")
  private String descricaoRespostaAutorizador = null;
  @SerializedName("codigoRespostaFraude")
  private String codigoRespostaFraude = null;
  @SerializedName("descricaoRespostaFraude")
  private String descricaoRespostaFraude = null;
  @SerializedName("origemTransacao")
  private String origemTransacao = null;
  @SerializedName("codigoModoEntradaTerminal")
  private String codigoModoEntradaTerminal = null;
  @SerializedName("descricaoModoEntradaTerminal")
  private String descricaoModoEntradaTerminal = null;
  @SerializedName("cpf")
  private String cpf = null;
  @SerializedName("cnpj")
  private String cnpj = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("telefones")
  private List<TelefoneResponse> telefones = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do risco de fraude
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do risco de fraude")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do tipo de resolu\u00E7\u00E3o atribu\u00EDdo ao registro
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do tipo de resolu\u00E7\u00E3o atribu\u00EDdo ao registro")
  public Long getIdTipoResolucao() {
    return idTipoResolucao;
  }
  public void setIdTipoResolucao(Long idTipoResolucao) {
    this.idTipoResolucao = idTipoResolucao;
  }

  
  /**
   * Descri\u00E7\u00E3o do tipo de resolu\u00E7\u00E3o atribu\u00EDdo ao registro
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do tipo de resolu\u00E7\u00E3o atribu\u00EDdo ao registro")
  public String getDescricaoTipoResolucao() {
    return descricaoTipoResolucao;
  }
  public void setDescricaoTipoResolucao(String descricaoTipoResolucao) {
    this.descricaoTipoResolucao = descricaoTipoResolucao;
  }

  
  /**
   * Indica que a transa\u00E7\u00E3o possui um alto risco de fraude e que todas as transa\u00E7\u00F5es seguintes a ela ser\u00E3o negadas at\u00E9 que todas as transa\u00E7\u00F5es classificadas com risco de fraude sejam analisadas
   **/
  @ApiModelProperty(value = "Indica que a transa\u00E7\u00E3o possui um alto risco de fraude e que todas as transa\u00E7\u00F5es seguintes a ela ser\u00E3o negadas at\u00E9 que todas as transa\u00E7\u00F5es classificadas com risco de fraude sejam analisadas")
  public Boolean getFlagAltoRisco() {
    return flagAltoRisco;
  }
  public void setFlagAltoRisco(Boolean flagAltoRisco) {
    this.flagAltoRisco = flagAltoRisco;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da conta
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do cart\u00E3o")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do produto
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do produto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da transa\u00E7\u00E3o")
  public Long getIdTransacao() {
    return idTransacao;
  }
  public void setIdTransacao(Long idTransacao) {
    this.idTransacao = idTransacao;
  }

  
  /**
   * Data que a transa\u00E7\u00E3o classificada com risco de fraude foi realizada
   **/
  @ApiModelProperty(value = "Data que a transa\u00E7\u00E3o classificada com risco de fraude foi realizada")
  public String getDataTransacao() {
    return dataTransacao;
  }
  public void setDataTransacao(String dataTransacao) {
    this.dataTransacao = dataTransacao;
  }

  
  /**
   * Valor da transa\u00E7\u00E3o classificada com risco de fraude
   **/
  @ApiModelProperty(value = "Valor da transa\u00E7\u00E3o classificada com risco de fraude")
  public BigDecimal getValorTransacao() {
    return valorTransacao;
  }
  public void setValorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
  }

  
  /**
   * C\u00F3digo da moeda de origem utilizada para a transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo da moeda de origem utilizada para a transa\u00E7\u00E3o")
  public String getCodigoMoedaOrigem() {
    return codigoMoedaOrigem;
  }
  public void setCodigoMoedaOrigem(String codigoMoedaOrigem) {
    this.codigoMoedaOrigem = codigoMoedaOrigem;
  }

  
  /**
   * Valor da transa\u00E7\u00E3o na moeda de origem
   **/
  @ApiModelProperty(value = "Valor da transa\u00E7\u00E3o na moeda de origem")
  public BigDecimal getValorOrigem() {
    return valorOrigem;
  }
  public void setValorOrigem(BigDecimal valorOrigem) {
    this.valorOrigem = valorOrigem;
  }

  
  /**
   * C\u00F3digo da moeda de destino utilizada para a transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo da moeda de destino utilizada para a transa\u00E7\u00E3o")
  public String getCodigoMoedaDestino() {
    return codigoMoedaDestino;
  }
  public void setCodigoMoedaDestino(String codigoMoedaDestino) {
    this.codigoMoedaDestino = codigoMoedaDestino;
  }

  
  /**
   * Valor da transa\u00E7\u00E3o na moeda de destino
   **/
  @ApiModelProperty(value = "Valor da transa\u00E7\u00E3o na moeda de destino")
  public BigDecimal getValorDestino() {
    return valorDestino;
  }
  public void setValorDestino(BigDecimal valorDestino) {
    this.valorDestino = valorDestino;
  }

  
  /**
   * Nome do estabelecimento onde a transa\u00E7\u00E3o  com risco de fraude foi realizada
   **/
  @ApiModelProperty(value = "Nome do estabelecimento onde a transa\u00E7\u00E3o  com risco de fraude foi realizada")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Pa\u00EDs
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do Pa\u00EDs")
  public String getIdPais() {
    return idPais;
  }
  public void setIdPais(String idPais) {
    this.idPais = idPais;
  }

  
  /**
   * C\u00F3digo de resposta do autorizador para a transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo de resposta do autorizador para a transa\u00E7\u00E3o")
  public String getCodigoRespostaAutorizador() {
    return codigoRespostaAutorizador;
  }
  public void setCodigoRespostaAutorizador(String codigoRespostaAutorizador) {
    this.codigoRespostaAutorizador = codigoRespostaAutorizador;
  }

  
  /**
   * Descri\u00E7\u00E3o da resposta do autorizador para a transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o da resposta do autorizador para a transa\u00E7\u00E3o")
  public String getDescricaoRespostaAutorizador() {
    return descricaoRespostaAutorizador;
  }
  public void setDescricaoRespostaAutorizador(String descricaoRespostaAutorizador) {
    this.descricaoRespostaAutorizador = descricaoRespostaAutorizador;
  }

  
  /**
   * C\u00F3digo de resposta da ferramenta de Preven\u00E7\u00E3o a Fraude para a transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo de resposta da ferramenta de Preven\u00E7\u00E3o a Fraude para a transa\u00E7\u00E3o")
  public String getCodigoRespostaFraude() {
    return codigoRespostaFraude;
  }
  public void setCodigoRespostaFraude(String codigoRespostaFraude) {
    this.codigoRespostaFraude = codigoRespostaFraude;
  }

  
  /**
   * Descri\u00E7\u00E3o da resposta da ferramenta de Preven\u00E7\u00E3o a Fraude para a transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o da resposta da ferramenta de Preven\u00E7\u00E3o a Fraude para a transa\u00E7\u00E3o")
  public String getDescricaoRespostaFraude() {
    return descricaoRespostaFraude;
  }
  public void setDescricaoRespostaFraude(String descricaoRespostaFraude) {
    this.descricaoRespostaFraude = descricaoRespostaFraude;
  }

  
  /**
   * Tipo de Terminal que originou a Transa\u00E7\u00E3o (POS, ATM, TEF, etc)
   **/
  @ApiModelProperty(value = "Tipo de Terminal que originou a Transa\u00E7\u00E3o (POS, ATM, TEF, etc)")
  public String getOrigemTransacao() {
    return origemTransacao;
  }
  public void setOrigemTransacao(String origemTransacao) {
    this.origemTransacao = origemTransacao;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do modo de origem da captura da Transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do modo de origem da captura da Transa\u00E7\u00E3o")
  public String getCodigoModoEntradaTerminal() {
    return codigoModoEntradaTerminal;
  }
  public void setCodigoModoEntradaTerminal(String codigoModoEntradaTerminal) {
    this.codigoModoEntradaTerminal = codigoModoEntradaTerminal;
  }

  
  /**
   * Descri\u00E7\u00E3o do modo de origem da captura da Transa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do modo de origem da captura da Transa\u00E7\u00E3o")
  public String getDescricaoModoEntradaTerminal() {
    return descricaoModoEntradaTerminal;
  }
  public void setDescricaoModoEntradaTerminal(String descricaoModoEntradaTerminal) {
    this.descricaoModoEntradaTerminal = descricaoModoEntradaTerminal;
  }

  
  /**
   * N\u00FAmero do CPF da Pessoa portadora do Cart\u00E3o, quando for do tipo Pessoa F\u00EDsica
   **/
  @ApiModelProperty(value = "N\u00FAmero do CPF da Pessoa portadora do Cart\u00E3o, quando for do tipo Pessoa F\u00EDsica")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * N\u00FAmero do CNPJ da Pessoa portadora do Cart\u00E3o, quanto for do tipo Pessoa Jur\u00EDdica
   **/
  @ApiModelProperty(value = "N\u00FAmero do CNPJ da Pessoa portadora do Cart\u00E3o, quanto for do tipo Pessoa Jur\u00EDdica")
  public String getCnpj() {
    return cnpj;
  }
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  
  /**
   * Endere\u00E7o de email da Pessoa portadora do Cart\u00E3o
   **/
  @ApiModelProperty(value = "Endere\u00E7o de email da Pessoa portadora do Cart\u00E3o")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Lista de telefones associados ao portador do Cart\u00E3o
   **/
  @ApiModelProperty(value = "Lista de telefones associados ao portador do Cart\u00E3o")
  public List<TelefoneResponse> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelefoneResponse> telefones) {
    this.telefones = telefones;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiscoFraudeDetalhadoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idTipoResolucao: ").append(idTipoResolucao).append("\n");
    sb.append("  descricaoTipoResolucao: ").append(descricaoTipoResolucao).append("\n");
    sb.append("  flagAltoRisco: ").append(flagAltoRisco).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  idTransacao: ").append(idTransacao).append("\n");
    sb.append("  dataTransacao: ").append(dataTransacao).append("\n");
    sb.append("  valorTransacao: ").append(valorTransacao).append("\n");
    sb.append("  codigoMoedaOrigem: ").append(codigoMoedaOrigem).append("\n");
    sb.append("  valorOrigem: ").append(valorOrigem).append("\n");
    sb.append("  codigoMoedaDestino: ").append(codigoMoedaDestino).append("\n");
    sb.append("  valorDestino: ").append(valorDestino).append("\n");
    sb.append("  nomeEstabelecimento: ").append(nomeEstabelecimento).append("\n");
    sb.append("  idPais: ").append(idPais).append("\n");
    sb.append("  codigoRespostaAutorizador: ").append(codigoRespostaAutorizador).append("\n");
    sb.append("  descricaoRespostaAutorizador: ").append(descricaoRespostaAutorizador).append("\n");
    sb.append("  codigoRespostaFraude: ").append(codigoRespostaFraude).append("\n");
    sb.append("  descricaoRespostaFraude: ").append(descricaoRespostaFraude).append("\n");
    sb.append("  origemTransacao: ").append(origemTransacao).append("\n");
    sb.append("  codigoModoEntradaTerminal: ").append(codigoModoEntradaTerminal).append("\n");
    sb.append("  descricaoModoEntradaTerminal: ").append(descricaoModoEntradaTerminal).append("\n");
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("  cnpj: ").append(cnpj).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  telefones: ").append(telefones).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
