package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.ConsultaCadastroEstabelecimentoDTO;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Estabelecimento
 **/
@ApiModel(description = "Objeto Estabelecimento")
public class EstabelecimentoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("numeroEstabelecimento")
  private String numeroEstabelecimento = null;
  @SerializedName("flagMatriz")
  private Integer flagMatriz = null;
  @SerializedName("idGrupoEconomico")
  private Long idGrupoEconomico = null;
  @SerializedName("numeroReceitaFederal")
  private Long numeroReceitaFederal = null;
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
  private String numeroEndereco = null;
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
  private String numeroEndereco2 = null;
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
  @SerializedName("terminal")
  private String terminal = null;
  @SerializedName("dataCadastramento")
  private String dataCadastramento = null;
  @SerializedName("usuario")
  private String usuario = null;

  
  /**
   * Identification Code of the Merchant (id)
   **/
  @ApiModelProperty(value = "Identification Code of the Merchant (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identification Number of the Merchant at Conductor
   **/
  @ApiModelProperty(value = "Identification Number of the Merchant at Conductor")
  public String getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(String numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  
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
   * Show the number of the indentification number of the merchant in IRs
   **/
  @ApiModelProperty(value = "Show the number of the indentification number of the merchant in IRs")
  public Long getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(Long numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * Merchant name
   **/
  @ApiModelProperty(value = "Merchant name")
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
   * Merchant Commercial Title
   **/
  @ApiModelProperty(value = "Merchant Commercial Title")
  public String getNomeFantasia() {
    return nomeFantasia;
  }
  public void setNomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
  }

  
  /**
   * Mail Code (Zipcode)
   **/
  @ApiModelProperty(value = "Mail Code (Zipcode)")
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
   * Address number
   **/
  @ApiModelProperty(value = "Address number")
  public String getNumeroEndereco() {
    return numeroEndereco;
  }
  public void setNumeroEndereco(String numeroEndereco) {
    this.numeroEndereco = numeroEndereco;
  }

  
  /**
   * Neighborhood name
   **/
  @ApiModelProperty(value = "Neighborhood name")
  public String getBairro() {
    return bairro;
  }
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  
  /**
   * Address city name
   **/
  @ApiModelProperty(value = "Address city name")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * Complementary Descriptions referring to the address
   **/
  @ApiModelProperty(value = "Complementary Descriptions referring to the address")
  public String getComplemento() {
    return complemento;
  }
  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  
  /**
   * Acronym of the Federal Unity identification of the address
   **/
  @ApiModelProperty(value = "Acronym of the Federal Unity identification of the address")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   * Zip Code
   **/
  @ApiModelProperty(value = "Zip Code")
  public String getCep2() {
    return cep2;
  }
  public void setCep2(String cep2) {
    this.cep2 = cep2;
  }

  
  /**
   * Name of the Street
   **/
  @ApiModelProperty(value = "Name of the Street")
  public String getNomeLogradouro2() {
    return nomeLogradouro2;
  }
  public void setNomeLogradouro2(String nomeLogradouro2) {
    this.nomeLogradouro2 = nomeLogradouro2;
  }

  
  /**
   * Address number
   **/
  @ApiModelProperty(value = "Address number")
  public String getNumeroEndereco2() {
    return numeroEndereco2;
  }
  public void setNumeroEndereco2(String numeroEndereco2) {
    this.numeroEndereco2 = numeroEndereco2;
  }

  
  /**
   * Neighborhood address name
   **/
  @ApiModelProperty(value = "Neighborhood address name")
  public String getBairro2() {
    return bairro2;
  }
  public void setBairro2(String bairro2) {
    this.bairro2 = bairro2;
  }

  
  /**
   * Name of the city
   **/
  @ApiModelProperty(value = "Name of the city")
  public String getCidade2() {
    return cidade2;
  }
  public void setCidade2(String cidade2) {
    this.cidade2 = cidade2;
  }

  
  /**
   * Complementary Descriptions refering to the address
   **/
  @ApiModelProperty(value = "Complementary Descriptions refering to the address")
  public String getComplemento2() {
    return complemento2;
  }
  public void setComplemento2(String complemento2) {
    this.complemento2 = complemento2;
  }

  
  /**
   * Acronym of the Federal Unity identification of the address
   **/
  @ApiModelProperty(value = "Acronym of the Federal Unity identification of the address")
  public String getUf2() {
    return uf2;
  }
  public void setUf2(String uf2) {
    this.uf2 = uf2;
  }

  
  /**
   * Especific details about the Merchant Register
   **/
  @ApiModelProperty(value = "Especific details about the Merchant Register")
  public String getObs() {
    return obs;
  }
  public void setObs(String obs) {
    this.obs = obs;
  }

  
  /**
   * Name of the person for the contact with the Merchant
   **/
  @ApiModelProperty(value = "Name of the person for the contact with the Merchant")
  public String getContato() {
    return contato;
  }
  public void setContato(String contato) {
    this.contato = contato;
  }

  
  /**
   * E-mail of the pessoa to contact with the Merchant
   **/
  @ApiModelProperty(value = "E-mail of the pessoa to contact with the Merchant")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Indicate if the Merchant will be included in the file of register to the Secretary of State Treasury
   **/
  @ApiModelProperty(value = "Indicate if the Merchant will be included in the file of register to the Secretary of State Treasury")
  public Integer getFlagArquivoSecrFazenda() {
    return flagArquivoSecrFazenda;
  }
  public void setFlagArquivoSecrFazenda(Integer flagArquivoSecrFazenda) {
    this.flagArquivoSecrFazenda = flagArquivoSecrFazenda;
  }

  
  /**
   * Indicate if the Merchant can originate transactions without reading the magnetic stripe or the card chip
   **/
  @ApiModelProperty(value = "Indicate if the Merchant can originate transactions without reading the magnetic stripe or the card chip")
  public Integer getFlagCartaoDigitado() {
    return flagCartaoDigitado;
  }
  public void setFlagCartaoDigitado(Integer flagCartaoDigitado) {
    this.flagCartaoDigitado = flagCartaoDigitado;
  }

  
  /**
   * Indicate if the Merchant is inactive
   **/
  @ApiModelProperty(value = "Indicate if the Merchant is inactive")
  public Integer getInativo() {
    return inativo;
  }
  public void setInativo(Integer inativo) {
    this.inativo = inativo;
  }

  
  /**
   * Identifier Code fo the currency
   **/
  @ApiModelProperty(value = "Identifier Code fo the currency")
  public Long getIdMoeda() {
    return idMoeda;
  }
  public void setIdMoeda(Long idMoeda) {
    this.idMoeda = idMoeda;
  }

  
  /**
   * Country Identifier
   **/
  @ApiModelProperty(value = "Country Identifier")
  public Long getIdPais() {
    return idPais;
  }
  public void setIdPais(Long idPais) {
    this.idPais = idPais;
  }

  
  /**
   * Number associated to the SPCBrazil
   **/
  @ApiModelProperty(value = "Number associated to the SPCBrazil")
  public Integer getAssociadoSPCBrasil() {
    return associadoSPCBrasil;
  }
  public void setAssociadoSPCBrasil(Integer associadoSPCBrasil) {
    this.associadoSPCBrasil = associadoSPCBrasil;
  }

  
  /**
   * Merchant Catergory Code
   **/
  @ApiModelProperty(value = "Merchant Catergory Code")
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
   * Type of Mail (MAIL, MAIL)
   **/
  @ApiModelProperty(value = "Type of Mail (MAIL, MAIL)")
  public Integer getCorrespondencia() {
    return correspondencia;
  }
  public void setCorrespondencia(Integer correspondencia) {
    this.correspondencia = correspondencia;
  }

  
  /**
   * Position of the Merchant
   **/
  @ApiModelProperty(value = "Position of the Merchant")
  public String getCargoContato() {
    return cargoContato;
  }
  public void setCargoContato(String cargoContato) {
    this.cargoContato = cargoContato;
  }

  
  /**
   * Type of the Merchant Payment Scheme
   **/
  @ApiModelProperty(value = "Type of the Merchant Payment Scheme")
  public TipoPagamentoEnum getTipoPagamento() {
    return tipoPagamento;
  }
  public void setTipoPagamento(TipoPagamentoEnum tipoPagamento) {
    this.tipoPagamento = tipoPagamento;
  }

  
  /**
   * Retrieve the register number one
   **/
  @ApiModelProperty(value = "Retrieve the register number one")
  public ConsultaCadastroEstabelecimentoDTO getConsulta() {
    return consulta;
  }
  public void setConsulta(ConsultaCadastroEstabelecimentoDTO consulta) {
    this.consulta = consulta;
  }

  
  /**
   * Retrieve of register number two
   **/
  @ApiModelProperty(value = "Retrieve of register number two")
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
   * Terminal of the Merchant
   **/
  @ApiModelProperty(value = "Terminal of the Merchant")
  public String getTerminal() {
    return terminal;
  }
  public void setTerminal(String terminal) {
    this.terminal = terminal;
  }

  
  /**
   * Resgister date of the Merchant
   **/
  @ApiModelProperty(value = "Resgister date of the Merchant")
  public String getDataCadastramento() {
    return dataCadastramento;
  }
  public void setDataCadastramento(String dataCadastramento) {
    this.dataCadastramento = dataCadastramento;
  }

  
  /**
   * User of the application
   **/
  @ApiModelProperty(value = "User of the application")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstabelecimentoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  numeroEstabelecimento: ").append(numeroEstabelecimento).append("\n");
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
    sb.append("  terminal: ").append(terminal).append("\n");
    sb.append("  dataCadastramento: ").append(dataCadastramento).append("\n");
    sb.append("  usuario: ").append(usuario).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
