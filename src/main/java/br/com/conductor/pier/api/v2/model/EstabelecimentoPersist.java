package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.ConsultaCadastroEstabelecimentoDTO;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Request Parameters of a Merchant
 **/
@ApiModel(description = "Request Parameters of a Merchant")
public class EstabelecimentoPersist  {
  
  @SerializedName("flagMatriz")
  private Integer flagMatriz = null;
  @SerializedName("idGrupoEconomico")
  private Long idGrupoEconomico = null;
  @SerializedName("numeroReceitaFederal")
  private String numeroReceitaFederal = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("nomeFantasia")
  private String nomeFantasia = null;
  @SerializedName("cep")
  private String cep = null;
  @SerializedName("nomeLogradouro")
  private String nomeLogradouro = null;
  @SerializedName("numeroEndereco")
  private Integer numeroEndereco = null;
  @SerializedName("bairro")
  private String bairro = null;
  @SerializedName("cidade")
  private String cidade = null;
  @SerializedName("complemento")
  private String complemento = null;
  @SerializedName("uf")
  private String uf = null;
  @SerializedName("cep2")
  private String cep2 = null;
  @SerializedName("nomeLogradouro2")
  private String nomeLogradouro2 = null;
  @SerializedName("numeroEndereco2")
  private Integer numeroEndereco2 = null;
  @SerializedName("bairro2")
  private String bairro2 = null;
  @SerializedName("cidade2")
  private String cidade2 = null;
  @SerializedName("complemento2")
  private String complemento2 = null;
  @SerializedName("uf2")
  private String uf2 = null;
  @SerializedName("obs")
  private String obs = null;
  @SerializedName("contato")
  private String contato = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("flagArquivoSecrFazenda")
  private Integer flagArquivoSecrFazenda = null;
  @SerializedName("flagCartaoDigitado")
  private Integer flagCartaoDigitado = null;
  @SerializedName("inativo")
  private Integer inativo = null;
  @SerializedName("idMoeda")
  private Long idMoeda = null;
  @SerializedName("idPais")
  private Long idPais = null;
  @SerializedName("associadoSPCBrasil")
  private Integer associadoSPCBrasil = null;
  @SerializedName("mcc")
  private Long mcc = null;
  @SerializedName("idTipoEstabelecimento")
  private Long idTipoEstabelecimento = null;
  @SerializedName("correspondencia")
  private Integer correspondencia = null;
  @SerializedName("cargoContato")
  private String cargoContato = null;
  public enum TipoPagamentoEnum {
     CENTRALIZADO,  PV, 
  };
  @SerializedName("tipoPagamento")
  private TipoPagamentoEnum tipoPagamento = null;
  @SerializedName("consulta")
  private ConsultaCadastroEstabelecimentoDTO consulta = null;
  @SerializedName("consulta2")
  private ConsultaCadastroEstabelecimentoDTO consulta2 = null;
  @SerializedName("consulta3")
  private ConsultaCadastroEstabelecimentoDTO consulta3 = null;
  @SerializedName("flagTerminalVirtual")
  private Boolean flagTerminalVirtual = null;
  @SerializedName("flagConsultaExtrato")
  private Boolean flagConsultaExtrato = null;

  
  /**
   * Indicate if it is headquarter or Branch
   **/
  @ApiModelProperty(value = "Indicate if it is headquarter or Branch")
  public Integer getFlagMatriz() {
    return flagMatriz;
  }
  public void setFlagMatriz(Integer flagMatriz) {
    this.flagMatriz = flagMatriz;
  }

  
  /**
   * Show the identification number of the Economic Group
   **/
  @ApiModelProperty(value = "Show the identification number of the Economic Group")
  public Long getIdGrupoEconomico() {
    return idGrupoEconomico;
  }
  public void setIdGrupoEconomico(Long idGrupoEconomico) {
    this.idGrupoEconomico = idGrupoEconomico;
  }

  
  /**
   * Federal revenue number
   **/
  @ApiModelProperty(value = "Federal revenue number")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * Name of the Merchant
   **/
  @ApiModelProperty(value = "Name of the Merchant")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Social Reason of the Merchant
   **/
  @ApiModelProperty(value = "Social Reason of the Merchant")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Commercial title of the Merchant
   **/
  @ApiModelProperty(value = "Commercial title of the Merchant")
  public String getNomeFantasia() {
    return nomeFantasia;
  }
  public void setNomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
  }

  
  /**
   * CEP
   **/
  @ApiModelProperty(value = "CEP")
  public String getCep() {
    return cep;
  }
  public void setCep(String cep) {
    this.cep = cep;
  }

  
  /**
   * Name of the Street
   **/
  @ApiModelProperty(value = "Name of the Street")
  public String getNomeLogradouro() {
    return nomeLogradouro;
  }
  public void setNomeLogradouro(String nomeLogradouro) {
    this.nomeLogradouro = nomeLogradouro;
  }

  
  /**
   * Address Number
   **/
  @ApiModelProperty(value = "Address Number")
  public Integer getNumeroEndereco() {
    return numeroEndereco;
  }
  public void setNumeroEndereco(Integer numeroEndereco) {
    this.numeroEndereco = numeroEndereco;
  }

  
  /**
   * Neighborhood address
   **/
  @ApiModelProperty(value = "Neighborhood address")
  public String getBairro() {
    return bairro;
  }
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  
  /**
   * Address City name
   **/
  @ApiModelProperty(value = "Address City name")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * Descri??es complementares referente ao endere?o
   **/
  @ApiModelProperty(value = "Descri??es complementares referente ao endere?o")
  public String getComplemento() {
    return complemento;
  }
  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  
  /**
   * Acronym of identification of the Address Federal Unity
   **/
  @ApiModelProperty(value = "Acronym of identification of the Address Federal Unity")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   * CEP2
   **/
  @ApiModelProperty(value = "CEP2")
  public String getCep2() {
    return cep2;
  }
  public void setCep2(String cep2) {
    this.cep2 = cep2;
  }

  
  /**
   * Street name
   **/
  @ApiModelProperty(value = "Street name")
  public String getNomeLogradouro2() {
    return nomeLogradouro2;
  }
  public void setNomeLogradouro2(String nomeLogradouro2) {
    this.nomeLogradouro2 = nomeLogradouro2;
  }

  
  /**
   * Address Number
   **/
  @ApiModelProperty(value = "Address Number")
  public Integer getNumeroEndereco2() {
    return numeroEndereco2;
  }
  public void setNumeroEndereco2(Integer numeroEndereco2) {
    this.numeroEndereco2 = numeroEndereco2;
  }

  
  /**
   * Name of the neighborhood
   **/
  @ApiModelProperty(value = "Name of the neighborhood")
  public String getBairro2() {
    return bairro2;
  }
  public void setBairro2(String bairro2) {
    this.bairro2 = bairro2;
  }

  
  /**
   * Address City name
   **/
  @ApiModelProperty(value = "Address City name")
  public String getCidade2() {
    return cidade2;
  }
  public void setCidade2(String cidade2) {
    this.cidade2 = cidade2;
  }

  
  /**
   * Descri??es complementares referente ao endere?o
   **/
  @ApiModelProperty(value = "Descri??es complementares referente ao endere?o")
  public String getComplemento2() {
    return complemento2;
  }
  public void setComplemento2(String complemento2) {
    this.complemento2 = complemento2;
  }

  
  /**
   * Acronym of the identification of Federal Unity
   **/
  @ApiModelProperty(value = "Acronym of the identification of Federal Unity")
  public String getUf2() {
    return uf2;
  }
  public void setUf2(String uf2) {
    this.uf2 = uf2;
  }

  
  /**
   * Specific Details when according to the Merchant Register
   **/
  @ApiModelProperty(value = "Specific Details when according to the Merchant Register")
  public String getObs() {
    return obs;
  }
  public void setObs(String obs) {
    this.obs = obs;
  }

  
  /**
   * Name of the person to contact with the Merchant
   **/
  @ApiModelProperty(value = "Name of the person to contact with the Merchant")
  public String getContato() {
    return contato;
  }
  public void setContato(String contato) {
    this.contato = contato;
  }

  
  /**
   * E-mail of the person to contact with the Merchant
   **/
  @ApiModelProperty(value = "E-mail of the person to contact with the Merchant")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Indicate if the merchant will be include in the registerment file for the State Treasuary Secretary
   **/
  @ApiModelProperty(value = "Indicate if the merchant will be include in the registerment file for the State Treasuary Secretary")
  public Integer getFlagArquivoSecrFazenda() {
    return flagArquivoSecrFazenda;
  }
  public void setFlagArquivoSecrFazenda(Integer flagArquivoSecrFazenda) {
    this.flagArquivoSecrFazenda = flagArquivoSecrFazenda;
  }

  
  /**
   * Indicate if the merhcant can originate transactions without the reading of the magnetic stripe or the card chip
   **/
  @ApiModelProperty(value = "Indicate if the merhcant can originate transactions without the reading of the magnetic stripe or the card chip")
  public Integer getFlagCartaoDigitado() {
    return flagCartaoDigitado;
  }
  public void setFlagCartaoDigitado(Integer flagCartaoDigitado) {
    this.flagCartaoDigitado = flagCartaoDigitado;
  }

  
  /**
   * Indicate if the merchant is inactive
   **/
  @ApiModelProperty(value = "Indicate if the merchant is inactive")
  public Integer getInativo() {
    return inativo;
  }
  public void setInativo(Integer inativo) {
    this.inativo = inativo;
  }

  
  /**
   * Identifier Code of the Currency
   **/
  @ApiModelProperty(value = "Identifier Code of the Currency")
  public Long getIdMoeda() {
    return idMoeda;
  }
  public void setIdMoeda(Long idMoeda) {
    this.idMoeda = idMoeda;
  }

  
  /**
   * Identifiier of the country
   **/
  @ApiModelProperty(value = "Identifiier of the country")
  public Long getIdPais() {
    return idPais;
  }
  public void setIdPais(Long idPais) {
    this.idPais = idPais;
  }

  
  /**
   * Associated number to the SPCBrazil
   **/
  @ApiModelProperty(value = "Associated number to the SPCBrazil")
  public Integer getAssociadoSPCBrasil() {
    return associadoSPCBrasil;
  }
  public void setAssociadoSPCBrasil(Integer associadoSPCBrasil) {
    this.associadoSPCBrasil = associadoSPCBrasil;
  }

  
  /**
   * Merchant Category Code
   **/
  @ApiModelProperty(value = "Merchant Category Code")
  public Long getMcc() {
    return mcc;
  }
  public void setMcc(Long mcc) {
    this.mcc = mcc;
  }

  
  /**
   * Identification Code of the Merchant
   **/
  @ApiModelProperty(value = "Identification Code of the Merchant")
  public Long getIdTipoEstabelecimento() {
    return idTipoEstabelecimento;
  }
  public void setIdTipoEstabelecimento(Long idTipoEstabelecimento) {
    this.idTipoEstabelecimento = idTipoEstabelecimento;
  }

  
  /**
   * Indicator which the address the mails will be sent, where 1 is ORIGIN and 2 MAIL ADDRESS
   **/
  @ApiModelProperty(value = "Indicator which the address the mails will be sent, where 1 is ORIGIN and 2 MAIL ADDRESS")
  public Integer getCorrespondencia() {
    return correspondencia;
  }
  public void setCorrespondencia(Integer correspondencia) {
    this.correspondencia = correspondencia;
  }

  
  /**
   * Merchant Contact Occupation
   **/
  @ApiModelProperty(value = "Merchant Contact Occupation")
  public String getCargoContato() {
    return cargoContato;
  }
  public void setCargoContato(String cargoContato) {
    this.cargoContato = cargoContato;
  }

  
  /**
   * Regime type of the merchant payment
   **/
  @ApiModelProperty(value = "Regime type of the merchant payment")
  public TipoPagamentoEnum getTipoPagamento() {
    return tipoPagamento;
  }
  public void setTipoPagamento(TipoPagamentoEnum tipoPagamento) {
    this.tipoPagamento = tipoPagamento;
  }

  
  /**
   * Register of register number one
   **/
  @ApiModelProperty(value = "Register of register number one")
  public ConsultaCadastroEstabelecimentoDTO getConsulta() {
    return consulta;
  }
  public void setConsulta(ConsultaCadastroEstabelecimentoDTO consulta) {
    this.consulta = consulta;
  }

  
  /**
   * Retrieve the register number 2
   **/
  @ApiModelProperty(value = "Retrieve the register number 2")
  public ConsultaCadastroEstabelecimentoDTO getConsulta2() {
    return consulta2;
  }
  public void setConsulta2(ConsultaCadastroEstabelecimentoDTO consulta2) {
    this.consulta2 = consulta2;
  }

  
  /**
   * Retrieve the register number three
   **/
  @ApiModelProperty(value = "Retrieve the register number three")
  public ConsultaCadastroEstabelecimentoDTO getConsulta3() {
    return consulta3;
  }
  public void setConsulta3(ConsultaCadastroEstabelecimentoDTO consulta3) {
    this.consulta3 = consulta3;
  }

  
  /**
   * Flag indicating if the terminal is physical or virtual, being: (true: Yes), (false: No))
   **/
  @ApiModelProperty(required = true, value = "Flag indicating if the terminal is physical or virtual, being: (true: Yes), (false: No))")
  public Boolean getFlagTerminalVirtual() {
    return flagTerminalVirtual;
  }
  public void setFlagTerminalVirtual(Boolean flagTerminalVirtual) {
    this.flagTerminalVirtual = flagTerminalVirtual;
  }

  
  /**
   * Flag indicating if the terminal allows the statement retrieving, being: (true: Yes), (false: No))
   **/
  @ApiModelProperty(required = true, value = "Flag indicating if the terminal allows the statement retrieving, being: (true: Yes), (false: No))")
  public Boolean getFlagConsultaExtrato() {
    return flagConsultaExtrato;
  }
  public void setFlagConsultaExtrato(Boolean flagConsultaExtrato) {
    this.flagConsultaExtrato = flagConsultaExtrato;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstabelecimentoPersist {\n");
    
    sb.append("  flagMatriz: ").append(flagMatriz).append("\n");
    sb.append("  idGrupoEconomico: ").append(idGrupoEconomico).append("\n");
    sb.append("  numeroReceitaFederal: ").append(numeroReceitaFederal).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  nomeFantasia: ").append(nomeFantasia).append("\n");
    sb.append("  cep: ").append(cep).append("\n");
    sb.append("  nomeLogradouro: ").append(nomeLogradouro).append("\n");
    sb.append("  numeroEndereco: ").append(numeroEndereco).append("\n");
    sb.append("  bairro: ").append(bairro).append("\n");
    sb.append("  cidade: ").append(cidade).append("\n");
    sb.append("  complemento: ").append(complemento).append("\n");
    sb.append("  uf: ").append(uf).append("\n");
    sb.append("  cep2: ").append(cep2).append("\n");
    sb.append("  nomeLogradouro2: ").append(nomeLogradouro2).append("\n");
    sb.append("  numeroEndereco2: ").append(numeroEndereco2).append("\n");
    sb.append("  bairro2: ").append(bairro2).append("\n");
    sb.append("  cidade2: ").append(cidade2).append("\n");
    sb.append("  complemento2: ").append(complemento2).append("\n");
    sb.append("  uf2: ").append(uf2).append("\n");
    sb.append("  obs: ").append(obs).append("\n");
    sb.append("  contato: ").append(contato).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  flagArquivoSecrFazenda: ").append(flagArquivoSecrFazenda).append("\n");
    sb.append("  flagCartaoDigitado: ").append(flagCartaoDigitado).append("\n");
    sb.append("  inativo: ").append(inativo).append("\n");
    sb.append("  idMoeda: ").append(idMoeda).append("\n");
    sb.append("  idPais: ").append(idPais).append("\n");
    sb.append("  associadoSPCBrasil: ").append(associadoSPCBrasil).append("\n");
    sb.append("  mcc: ").append(mcc).append("\n");
    sb.append("  idTipoEstabelecimento: ").append(idTipoEstabelecimento).append("\n");
    sb.append("  correspondencia: ").append(correspondencia).append("\n");
    sb.append("  cargoContato: ").append(cargoContato).append("\n");
    sb.append("  tipoPagamento: ").append(tipoPagamento).append("\n");
    sb.append("  consulta: ").append(consulta).append("\n");
    sb.append("  consulta2: ").append(consulta2).append("\n");
    sb.append("  consulta3: ").append(consulta3).append("\n");
    sb.append("  flagTerminalVirtual: ").append(flagTerminalVirtual).append("\n");
    sb.append("  flagConsultaExtrato: ").append(flagConsultaExtrato).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
