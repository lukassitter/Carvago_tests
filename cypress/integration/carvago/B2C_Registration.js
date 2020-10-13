describe('The Home Page', () => {
    it('successfully loads', () => {
      //visit carvago
      cy.visit('www.carvago.com')

      //Text Register is right
      cy.xpath("/html/body/div[1]/div/header/div/div[2]/nav/ul/div/div[2]/li[3]/button").should("have.text","Register")

      //Click on registration
      cy.xpath("/html/body/div[1]/div/header/div/div[2]/nav/ul/div/div[2]/li[3]/button").click()

      //wait for pop up
      cy.wait(3000)

      //Text is right
      cy.get('[data-test-id="signInForm_newCustomerButton"]').should("have.text","Register")

      //Click on register like B2C customer
      cy.get('[data-test-id="signInForm_newCustomerButton"]').click()

      //wait for pop up
      cy.wait(2000)

      //fill email
      cy.get('[name="email"]').type("lukas.sitter+" + Random_Number() +"@carvago.com")
      function Random_Number() {
        var text = "";
        var possible = "0123456789";

        for (var i = 0; i < 5; i++)
            text += possible.charAt(Math.floor(Math.random() * possible.length));

        return text;
}

      //Insert Password
      cy.get('[name="plain_password"]').type("tester01")

      //Check checkbox
      cy.get('[type="checkbox"]').check({force: true})

      //Click on "Register"
      //cy.get('[data-test-id="signInForm_newCustomerButton"]').click()
    })
  })
  